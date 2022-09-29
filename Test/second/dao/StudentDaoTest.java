package second.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import second.Utils.MybatisUtils;
import second.entity.Clazz;
import second.entity.Course;
import second.entity.Score;
import second.entity.Student;

import java.util.List;


class StudentDaoTest {
    static SqlSession sqlSession;
    static StudentDao studentDao;
    static ScoreDao scoreDao;
    static CourseDao courseDao;
    static ClassDao classDao;


    @BeforeAll
    static void init() {
        sqlSession = MybatisUtils.getSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
        scoreDao = sqlSession.getMapper(ScoreDao.class);
        classDao = sqlSession.getMapper(ClassDao.class);
        courseDao = sqlSession.getMapper(CourseDao.class);
    }

    @AfterAll
    static void close(){
        if(sqlSession != null){
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    void studentFindAll(){
        List<Student> list = studentDao.findOne( );

        for(Student std: list){
            System.out.println(std);
        }
    }

    @Test
    void findAllScore(){
        List<Score> list = scoreDao.findAllScore();
        for(Score score: list){
            System.out.println(score);
        }
    }

//    @Test
//    void findAllClass(){
//        List<Clazz> list = classDao.findAll();
//        for(Clazz cl: list){
//            System.out.println(cl);
//        }
// }
//    @Test
//    void findAllCourse(){
//        List<Course> list = courseDao.findAll();
//        for(Course cl: list){
//            System.out.println(cl);
//        }
//    }

}