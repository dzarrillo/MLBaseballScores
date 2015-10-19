package com.dzartek.mlbaseballscores.parsers;

import com.dzartek.mlbaseballscores.model.Baseball;

import java.util.List;

/**
 * Created by dzarrillo on 8/26/2015.
 */
public class BaseballXMLParser {



        public static List<Baseball> parseFeed(String content) {

            try {
                /*
                boolean inDataItemTag = false;
                String currentTagName = "";
                Baseball Baseball = null;
                List<Baseball> BaseballList = new ArrayList<>();

                XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
                XmlPullParser parser = factory.newPullParser();
                parser.setInput(new StringReader(content));

                int eventType = parser.getEventType();

                while (eventType != XmlPullParser.END_DOCUMENT) {

                    switch (eventType) {
                        case XmlPullParser.START_TAG:
                            currentTagName = parser.getName();
                            if (currentTagName.equals("product")) {
                                inDataItemTag = true;
                                Baseball = new Baseball();
                                BaseballList.add(Baseball);
                            }
                            break;

                        case XmlPullParser.END_TAG:
                            if (parser.getName().equals("product")) {
                                inDataItemTag = false;
                            }
                            currentTagName = "";
                            break;

                        case XmlPullParser.TEXT:
                            if (inDataItemTag && Baseball != null) {
                                switch (currentTagName) {
                                    case "productId":
                                        Baseball.setProductId(Integer.parseInt(parser.getText()));
                                        break;
                                    case "name":
                                        Baseball.setName(parser.getText());
                                        break;
                                    case "instructions":
                                        Baseball.setInstructions(parser.getText());
                                        break;
                                    case "category":
                                        Baseball.setCategory(parser.getText());
                                        break;
                                    case "price" :
                                        Baseball.setPrice(Double.parseDouble(parser.getText()));
                                        break;
                                    case "photo" :
                                        Baseball.setPhoto(parser.getText());
                                    default:
                                        break;
                                }
                            }
                            break;
                    }

                    eventType = parser.next();

                }

                return BaseballList;
            */
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

}
