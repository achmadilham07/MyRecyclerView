package com.example.myrecyclerview;

import java.util.ArrayList;

public class PokemonData {
    public static String[][] data = new String[][]{
            {"Bulbasaur","45","49","49","65","65","45","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F001Bulbasaur.png?alt=media&token=bae67cf3-ea24-493d-9535-25c10e1c8c0e","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F001Bulbasaur.png?alt=media&token=6c73546b-81ec-4c38-b992-38a593fc1f5f"},
            {"Ivysaur","60","62","63","80","80","60","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F002Ivysaur.png?alt=media&token=bfb76af1-c44a-4427-8040-0643a9dd44db","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F002Ivysaur.png?alt=media&token=efbf965b-f5ea-4b07-b00e-dbf5d22c5fd1"},
            {"Venusaur","80","82","83","100","100","80","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F003Venusaur.png?alt=media&token=77d2d7b6-f6f2-4be0-afdb-402b5ffab833","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F003Venusaur.png?alt=media&token=c3a5e0a9-24b8-4872-84a8-c383ea76152c"},
            {"Charmander","39","52","43","60","50","65","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F004Charmander.png?alt=media&token=3b0858dd-b111-41a5-a9ef-d73e891e04f1","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F004Charmander.png?alt=media&token=be3003eb-8eca-4773-9557-4051d84138b7"},
            {"Charmeleon","58","64","58","80","65","80","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F005Charmeleon.png?alt=media&token=340bce91-034a-40a9-8db4-7af39ee46fe5","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F005Charmeleon.png?alt=media&token=c814a9a1-4830-4507-8fb9-2365e336697e"},
            {"Charizard","78","84","78","100","85","100","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F006Charizard.png?alt=media&token=e8ad07b7-d0a6-48ea-b124-f16541a66f7e","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F006Charizard.png?alt=media&token=58e6b312-bb0f-43a2-856e-f368649e4d65"},
            {"Squirtle","44","48","65","50","64","43","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F007Squirtle.png?alt=media&token=0976b52e-0ad4-4c05-ae22-b38607dd7584","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F007Squirtle.png?alt=media&token=cbcd4720-d6de-4417-8acd-f8a58ab324d1"},
            {"Wartortle","59","63","80","65","80","58","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F008Wartortle.png?alt=media&token=4daf36cc-8d26-4de9-a374-88c92f1efaa0","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F008Wartortle.png?alt=media&token=f16082ff-ce4b-4c13-97f0-98003d761047"},
            {"Blastoise","79","83","100","85","100","78","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F009Blastoise.png?alt=media&token=3cf20b91-15ff-4d6d-a582-0dd8b307fec5","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F009Blastoise.png?alt=media&token=84674276-a83e-4ce8-a9b8-2d77c72b06a1"},
            {"Caterpie","45","30","35","20","20","45","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/images%2F010Caterpie.png?alt=media&token=4bf952f0-c6d7-43d2-a573-6b8addace34d","https://firebasestorage.googleapis.com/v0/b/fir-db-27707.appspot.com/o/thumbnails%2F010Caterpie.png?alt=media&token=7bba24ad-3ed3-45e7-9115-8412d9d12715"}
    };

    public static ArrayList<Pokemon> getListData(){
        Pokemon pokemon = null;
        ArrayList<Pokemon> list = new ArrayList<>();
        for (String[] aData : data) {
            pokemon = new Pokemon();
            pokemon.setName(aData[0]);
            pokemon.setHp(aData[1]);
            pokemon.setAttack(aData[2]);
            pokemon.setDef(aData[3]);
            pokemon.setSp_att(aData[4]);
            pokemon.setSp_def(aData[5]);
            pokemon.setSpeed(aData[6]);
            pokemon.setImage(aData[7]);
            pokemon.setThumbnail(aData[8]);

            list.add(pokemon);
        }

        return list;
    }

}