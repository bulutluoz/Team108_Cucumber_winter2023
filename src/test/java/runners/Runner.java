package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

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
 */
