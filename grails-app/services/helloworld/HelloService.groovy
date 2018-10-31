package helloworld

import grails.gorm.services.Service

@Service(Hello)
class HelloService {

    Hello get(String id){
        return Hello.findById(id)
    }

    List<Hello> list(Map args){
        return Hello.findAll(args)
    }

    Long count(){
        return Hello.count
    }

    void delete(String id){
        Hello.findById(id).delete(flush: true)
    }

    Hello save(Hello hello){
       return hello.save(flush:true)
    }
}