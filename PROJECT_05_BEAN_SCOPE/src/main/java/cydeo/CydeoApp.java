package cydeo;

import cydeo.config.ProjectConfig;
import cydeo.model.Comment;
import cydeo.service.CommentService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //                CommentService commentService1 = context.getBean(CommentService.class);
        //                CommentService commentService2 = context.getBean(CommentService.class);
        //
        //                System.out.println(commentService1);
        //                System.out.println(commentService2);

        // Singleton an object by default - mean Spring gives us a same object by default
        /* Compare if objects are the same --> true (CommentService@5677323c = CommentService@5677323c) it's a same project even when I created the new project
         * To use the different object or create different object we should add @Scope("prototype") or @Scope(BeanDefinition.SCOPE_PROTOTYPE) to "CommentService class" -->
         * After that we will get false, because Spring create the different object (CommentService@5677323c != CommentService@18df8434)
         */
        //                System.out.println(commentService1 == commentService2);
    }
}