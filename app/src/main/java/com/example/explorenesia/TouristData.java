package com.example.explorenesia;

import java.util.ArrayList;

public class TouristData {
    public static ArrayList<Tourist> getData() {
        ArrayList<Tourist> list = new ArrayList<>();

        list.add(new Tourist("Belitung Island", "Bangka Belitung",
                "Belitung Island is known for its scenic granite rocks, clear turquoise waters, and peaceful tropical beaches.\n\n"
                        + "It gained global fame after the movie 'Laskar Pelangi'.\n\n"
                        + "Visitors can enjoy island hopping, snorkeling, or simply relaxing at Tanjung Tinggi Beach.\n\n"
                        + "The island also offers delicious seafood and charming fishing villages that reflect local life.\n\n"
                        + "Address: Tanjung Pandan, Belitung Regency, Bangka Belitung Islands 33414.",
                R.drawable.belitung));

        list.add(new Tourist("Borobudur Temple", "Central Java",
                "Borobudur is a UNESCO World Heritage Site and the largest Buddhist temple in the world, built in the 9th century.\n\n"
                        + "It consists of nine stacked platforms adorned with intricate stone carvings and over 500 Buddha statues.\n\n"
                        + "Each level symbolizes the journey toward enlightenment.\n\n"
                        + "At sunrise, the temple radiates a mystical beauty as sunlight breaks through the misty valley of Magelang.\n\n"
                        + "Address: Jl. Badrawati, Borobudur, Magelang, Central Java 56553.",
                R.drawable.borobudur));

        list.add(new Tourist("Bromo Mountain", "East Java",
                "Mount Bromo is one of the most iconic volcanoes in Indonesia and part of the Tengger massif in East Java.\n\n"
                        + "It stands majestically amid a vast sea of volcanic sand known as the 'Sea of Sand.'\n\n"
                        + "The breathtaking sunrise view from Penanjakan Hill is a must-see for travelers, as the early morning mist reveals "
                        + "the silhouette of Mount Bromo and its neighboring peaks.\n\n"
                        + "Its mystical scenery and spiritual aura attract visitors from all over the world.\n\n"
                        + "Address: Bromo Tengger Semeru National Park, Probolinggo Regency, East Java 67254.",
                R.drawable.bromo));

        list.add(new Tourist("Bunaken Marine Park", "North Sulawesi",
                "Bunaken Marine Park is one of Indonesia’s premier diving destinations, known for its exceptional coral walls and marine biodiversity.\n\n"
                        + "The park covers over 75,000 hectares and offers diving experiences with crystal-clear visibility.\n\n"
                        + "Snorkelers and divers can encounter sea turtles, reef sharks, and colorful fish species.\n\n"
                        + "Address: Bunaken Island, Manado, North Sulawesi 95246.",
                R.drawable.bunaken));

        list.add(new Tourist("Derawan Islands", "East Kalimantan",
                "The Derawan Islands offer some of Indonesia’s best marine biodiversity.\n\n"
                        + "Visitors can swim with manta rays and turtles, dive among coral gardens, or explore Kakaban’s jellyfish lake.\n\n"
                        + "The islands remain relatively untouched, making them perfect for quiet retreats.\n\n"
                        + "Address: Derawan Islands, Berau Regency, East Kalimantan 77311.",
                R.drawable.derawan));

        list.add(new Tourist("Dieng Plateau", "Central Java",
                "Dieng Plateau sits above 2,000 meters and is often called ‘the land above the clouds.’\n\n"
                        + "It features colorful lakes, volcanic craters, and ancient temples.\n\n"
                        + "Every year, the Dieng Culture Festival draws visitors to witness unique cultural performances and natural beauty.\n\n"
                        + "Address: Wonosobo Regency, Central Java 56353.",
                R.drawable.dieng));

        list.add(new Tourist("Ijen Crater", "East Java",
                "The Ijen Crater is world-famous for its blue fire phenomenon, visible before dawn.\n\n"
                        + "At sunrise, travelers can witness the turquoise acid lake and sulfur miners working amid volcanic fumes — a breathtaking yet humbling sight.\n\n"
                        + "Address: Ijen National Park, Banyuwangi Regency, East Java 68454.",
                R.drawable.ijen));

        list.add(new Tourist("Kelimutu Lake", "Flores",
                "Mount Kelimutu is renowned for its three crater lakes that change colors throughout the year due to mineral variations.\n\n"
                        + "The mystical beauty of the lakes attracts both scientists and spiritual seekers.\n\n"
                        + "Watching the sunrise here feels magical as mist rolls over the mountain tops.\n\n"
                        + "Address: Kelimutu National Park, Ende Regency, Flores, East Nusa Tenggara 86351.",
                R.drawable.kelimutu));

        list.add(new Tourist("Komodo Island", "East Nusa Tenggara",
                "Komodo Island is home to the famous Komodo dragons, the largest living lizards on Earth.\n\n"
                        + "The island’s rugged landscape, pink beaches, and rich underwater ecosystem make it a true natural wonder.\n\n"
                        + "Visitors can hike through the park to see the dragons, explore coral reefs, or relax by the serene coastlines.\n\n"
                        + "Address: Komodo National Park, Labuan Bajo, East Nusa Tenggara 86554.",
                R.drawable.komodo));

        list.add(new Tourist("Kuta Beach", "Bali",
                "Kuta Beach is one of the most famous beaches in Indonesia, located on the southern coast of Bali.\n\n"
                        + "It is known for its long stretch of white sand, clear blue waters, and world-class waves for surfing.\n\n"
                        + "Visitors can enjoy beachside cafes, local markets, and vibrant nightlife along the coast. "
                        + "Kuta is also close to many modern facilities such as shopping malls, spas, and restaurants, making it a complete tourist destination.\n\n"
                        + "Address: Jl. Pantai Kuta, Kuta, Badung, Bali 80361.",
                R.drawable.kuta));

        list.add(new Tourist("Labuan Bajo", "East Nusa Tenggara",
                "Labuan Bajo serves as the gateway to Komodo National Park.\n\n"
                        + "It offers luxurious resorts, panoramic ocean views, and adventures such as diving, island-hopping, and sunset cruising.\n\n"
                        + "Padar Island nearby offers one of the best panoramic hikes in Indonesia.\n\n"
                        + "Address: Labuan Bajo, West Manggarai Regency, East Nusa Tenggara 86554.",
                R.drawable.labuan_bajo));

        list.add(new Tourist("Lake Sentani", "Papua",
                "Lake Sentani lies beneath the Cyclops Mountains and is famous for its cultural festivals, traditional boats, and scenic views.\n\n"
                        + "The surrounding villages are known for their unique wooden carvings and warm hospitality.\n\n"
                        + "Address: Sentani, Jayapura Regency, Papua 99352.",
                R.drawable.sentani));

        list.add(new Tourist("Mentawai Islands", "West Sumatra",
                "The Mentawai Islands are a surfer’s dream, known for their consistent and powerful waves.\n\n"
                        + "The islands are also home to indigenous tribes who maintain their ancient traditions and connection to nature.\n\n"
                        + "Address: Mentawai Islands Regency, West Sumatra 25391.",
                R.drawable.mentawai));

        list.add(new Tourist("Mount Rinjani", "Lombok",
                "Mount Rinjani is the second-highest volcano in Indonesia and a paradise for trekkers.\n\n"
                        + "The challenging trails reward adventurers with panoramic views, the Segara Anak lake, and surreal sunsets above the clouds.\n\n"
                        + "The surrounding forests and waterfalls add to its untouched natural charm.\n\n"
                        + "Address: Mount Rinjani National Park, Lombok, West Nusa Tenggara 83354.",
                R.drawable.rinjani));

        list.add(new Tourist("Raja Ampat Islands", "West Papua",
                "Raja Ampat is a paradise for divers and nature lovers, located off the northwest tip of Papua.\n\n"
                        + "It is home to over 1,500 small islands, coral reefs, and marine life that form one of the most biodiverse ecosystems on Earth.\n\n"
                        + "Above the surface, limestone karst formations and hidden lagoons create postcard-perfect scenery.\n\n"
                        + "Visitors can dive, kayak, or simply relax on its untouched beaches. "
                        + "Address: Raja Ampat Regency, West Papua 98482.",
                R.drawable.raja_ampat));

        list.add(new Tourist("Tanah Lot Temple", "Bali",
                "Tanah Lot Temple is one of Bali’s most iconic landmarks, perched on a rock formation surrounded by the sea.\n\n"
                        + "It offers a breathtaking view at sunset, where the temple silhouette contrasts beautifully with the glowing sky.\n\n"
                        + "The site is also an important part of Balinese culture and mythology.\n\n"
                        + "Address: Beraban, Kediri, Tabanan Regency, Bali 82121.",
                R.drawable.tanah_lot));

        list.add(new Tourist("Tanjung Puting National Park", "Central Kalimantan",
                "Tanjung Puting is one of the most important orangutan conservation areas in Indonesia.\n\n"
                        + "Visitors can cruise the Sekonyer River aboard traditional boats called 'klotok' to spot orangutans and proboscis monkeys.\n\n"
                        + "It’s a serene experience surrounded by the sounds of the rainforest.\n\n"
                        + "Address: Kumai, West Kotawaringin Regency, Central Kalimantan 74181.",
                R.drawable.tanjung_puting));

        list.add(new Tourist("Toba Lake", "North Sumatra",
                "Lake Toba is the largest volcanic lake in the world, formed by a supervolcanic eruption thousands of years ago.\n\n"
                        + "The vast blue waters are surrounded by pine forests, hills, and traditional Batak villages.\n\n"
                        + "At its center lies Samosir Island, a cultural heartland rich with local traditions, crafts, and warm hospitality.\n\n"
                        + "Tourists can enjoy boating, swimming, or exploring ancient Batak houses and stone relics.\n\n"
                        + "Address: Danau Toba, Kabupaten Samosir, Sumatera Utara 22395.",
                R.drawable.toba));

        list.add(new Tourist("Ubud Rice Terrace", "Bali",
                "The Tegallalang Rice Terrace in Ubud showcases Bali’s agricultural artistry and harmony with nature.\n\n"
                        + "The lush green layers of rice paddies stretch across the hills, offering breathtaking scenery.\n\n"
                        + "Visitors can take peaceful walks, enjoy local cuisine, or learn traditional crafts.\n\n"
                        + "Address: Tegallalang, Gianyar, Bali 80561.",
                R.drawable.ubud));

        list.add(new Tourist("Wakatobi National Park", "Southeast Sulawesi",
                "Wakatobi is a world-class diving paradise with colorful reefs and pristine waters.\n\n"
                        + "The area’s underwater biodiversity is among the richest on Earth, with more than 50 diving sites.\n\n"
                        + "Beyond the sea, visitors can explore traditional villages and experience the hospitality of local communities.\n\n"
                        + "Address: Wakatobi Regency, Southeast Sulawesi 93791.",
                R.drawable.wakatobi));

        return list;
    }
}
