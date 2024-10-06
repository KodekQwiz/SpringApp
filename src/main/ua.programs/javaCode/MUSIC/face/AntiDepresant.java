package MUSIC.face;

import Annotiation.FACE;
import MUSIC.Music;


@FACE
public class AntiDepresant implements Music {


    @Override
    public String Name() {
        return "Fc";
    }

    @Override
    public String Description() {
        return "Прикольная музыка для ваших ушей";
    }

    @Override
    public String Years() {
        return "2017";
    }

    @Override
    public String Author() {
        return "FACE";
    }
}
