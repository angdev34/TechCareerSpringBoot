package com.aysenurgokkaya.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class BeanDto {

   private long id;
   private String beanName;
   private String beanData;

   //bean başlamadan önce
   public void initialBeanMethod(){
      log.error("Start Bean başladı");
      System.out.println("Start Bean başladı");
   }

   //bean bittikten sonra
   public void destroyBeanMethod(){
      log.error("Finish Bean bitti");
      System.out.println("Finish Bean bitti");
   }
   //++++++++


/*   //PostContruct
   @Autowired
   Logger LOG;

   //parametresiz constructor
   public  BeanDto(){
      LOG.info("Log Dosyam constructordan geldi");
   }

   @PostConstruct
   public void init(){
      LOG.info("Log Dosyam constructordan geldi");
   }

   public static void main(String[] args) {
      BeanDto beanDto=new BeanDto();
      System.out.println(beanDto);
   }*/



}
