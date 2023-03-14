package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@demo" ,
        dryRun = false
)
public class Runner {

}

/*
    Runner class'i testlerimizi tekli veya toplu olarak calistirmamizi saglar
    Runner class'i BOS bir class'dir
    burada asil isi yapan 2 tane notasyon
    ve iclerine yazdigimiz argumentlerdir.

    @CucumberOptions icerisine yazacagimiz degerler
    bu Runner class'inin calistiracagi
        - feature dosyalarinin ve
        - feature dosyalarina ait Java method'larinin nerede oldugunu
        - ve bu feature dosyalari icerisinde olusturulan
          Scenario veya Feature'larin hangilerinin calistirilacagini belirler.

     dryRun  :  default degeri olan "false" oldugunda
                feature dosyasinda run tusuna bastigimiz gibi calistirir
                stepdefiniton'i olusturulan adimlari calistirir
                stepdefiniton'i olmayan ilk adimda, eksik adimlari bize raporlar

                Ancak bu tur calistirmada gereksiz calistirilan adimlar olur
                bunun yerine

                "true" degerini verirseniz
                testi calistirmayi denemez
                sadece adimlari kontrol eder ve eksik adim VARSA kodlari olusturur
                EKSIK ADIM YOKSA hic bir adimi calistirmadan TEST PASSED der
                buradaki test passed "EKSIK ADIM YOK" anlamina gelmektedir
 */
