package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VizitkaService {
  private final List<Vizitka> seznamVizitek = new ArrayList<>();

  public VizitkaService() {
    seznamVizitek.add(
              new Vizitka("Richard Dobrý", "Tlamagames", "Dlážděná 78", "Tmaň 26721", "info@tlamagames.com","www.tlamagames.com","+420 444555666"));
      seznamVizitek.add(
              new Vizitka("Lenka Láskorádová", "Zatrolené hry", "Holandská 123", "Beroun 26601", null,"www.seznam.cz","777444111"));
      seznamVizitek.add(
              new Vizitka("Věra Skálová", "Planeta her", "Nad Stadionem 359", "Králův Dvůr 26701", "email01@seznam.cz","www.web.cz","777444222"));
      seznamVizitek.add(
              new Vizitka("Simona Veselá", "HRAS", "Na Pankráci 123", "Praha 14000", null, null,null));
      seznamVizitek.add(
              new Vizitka("Štěpánka Smutná", "Svět Her", "Dlážděná 77", "Tmaň 26721", "email07@seznam.cz",null,null));
      seznamVizitek.add(
              new Vizitka("Kateřina Kůrková", "Fift", "Holandská 122", "Beroun 26601", "email11@seznam.cz","www.web2.cz","777444444"));
      seznamVizitek.add(
              new Vizitka("Jana Hrubá", "Veselý drak", "Nad Stadionem 357", "Králův Dvůr 26701", "email02@seznam.cz",null,"777444555"));
      seznamVizitek.add(
              new Vizitka("Karolina Světlá", "Luxor", "Václavské náměstí 41", "Praha 11000", null,"www.neoluxor.cz","+420 666 777 444"));
      seznamVizitek.add(
              new Vizitka("Lucie Výborná", "Korálkycz", "Vinohradská 1678/76", "Praha 13000", "info@manumi.cz",null,"777444111"));
      seznamVizitek.add(
              new Vizitka("Jana Lukášová", "Korálky komponenty", "Karlovo Náměstí 317/5", "Praha 12000", "mail@koralkykomponenty.cz","koralkykomponenty.cz",null));

    }

  public List<Vizitka> getAll() {
    return seznamVizitek;
  }
  public void pridejVizitku(Vizitka vizitka){
      seznamVizitek.add(vizitka);
  }
  public void smazVizitku(int id){
      seznamVizitek.remove(id);
  }

  public Vizitka getById(int id) {
    return seznamVizitek.get(id);
  }
}
