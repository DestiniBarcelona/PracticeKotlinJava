package com.example.demo

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BlobConfiguration {

    @Bean
    open fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {
        val smaldini = userRepository.save(User("smal", "Smal", "Dini"))
        articleRepository.save(Article(
                title = "White Monster is out",
                headline = "Stufff",
                content = "even more stuff",
                author = smaldini
        ))
        articleRepository.save(Article(
                title = "White Monster is in again",
                headline = "Stufff",
                content = "even more stuff",
                author = smaldini
        ))
    }
}
