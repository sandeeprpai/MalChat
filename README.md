Processing an image
=========================
public static ArrayList<ColorBean1> processImage(Image image) {
        try {
            //BufferedImage bImage = toBufferedImage(image);
            PixelGrabber pg = new PixelGrabber(image, 0, 0, image.getWidth(null), image.getHeight(null), true);
            int[] nextImgData = null;
            int currentPixelWidth = 0;
            int previousRedPixelWidth = -1;
            int previousGreenPixelWidth = -1;
            int previousBluePixelWidth = -1;
            int currentpixelHeight = 0;
            int previousRedPixelHeight = -1;
            int previousGreenPixelHeight = -1;
            int previousBluePixelHeight = -1;
            int redPixelCount = 0;
            int greenPixelCount = 0;
            int bluePixelCount = 0;
            int width = 0;
            int height = 0;
            ColorBean1 redColorBean = null;
            ColorBean1 greenColorBean = null;
            ColorBean1 blueColorBean = null;
            ArrayList<ColorBean1> colorBeans = new ArrayList<ColorBean1>();

            if (pg.grabPixels()) {
                width = pg.getWidth();
                height = pg.getHeight();
                nextImgData = new int[width * height];
                nextImgData = (int[]) pg.getPixels();
            }
            int i;

            int red = 0;
            int green = 0;
            int blue = 0;

            for (i = 0; i < (width * height); i++) {

                red = (nextImgData[i] >> 16) & 0xff;
                green = (nextImgData[i] >> 8) & 0xff;
                blue = (nextImgData[i] & 0xff);
                if (red <= AppConstants.RED_COMPONENT_OF_RED_MAX && red >= AppConstants.RED_COMPONENT_OF_RED_MIN
                        && green <= AppConstants.GREEN_COMPONENT_OF_RED_MAX && green >= AppConstants.GREEN_COMPONENT_OF_RED_MIN
                        && blue <= AppConstants.BLUE_COMPONENT_OF_RED_MAX && blue >= AppConstants.BLUE_COMPONENT_OF_RED_MIN
                        && redColorBean == null) {

                    greenPixelCount = 0;
                    bluePixelCount = 0;
                    currentpixelHeight = i / width;
                    currentPixelWidth = i % width;
                    if (currentpixelHeight != previousRedPixelHeight) {
                        redPixelCount = 1;
                    } else if (currentPixelWidth == previousRedPixelWidth + 1) {
                        redPixelCount++;
                    } else {
                        redPixelCount = 1;
                    }

                    if (redPixelCount >= AppConstants.THRESHOLD_COLOR_COUNT) {
                        redColorBean = new ColorBean1();
                        redColorBean.setColor("RED");
                        redColorBean.setStartingPixelWidth((currentPixelWidth
                                - AppConstants.THRESHOLD_COLOR_COUNT) + 1);
                        redColorBean.setEndingPixelWidth(currentPixelWidth);
                        redColorBean.setPixelHeight(currentpixelHeight);


                        colorBeans.add(redColorBean);
                   
                    }

                    previousRedPixelHeight = currentpixelHeight;
                    previousRedPixelWidth = currentPixelWidth;


                } else if (red >= AppConstants.RED_COMPONENT_OF_GREEN_MIN && red <= AppConstants.RED_COMPONENT_OF_GREEN_MAX
                        && green >= AppConstants.GREEN_COMPONENT_OF_GREEN_MIN && green <= AppConstants.GREEN_COMPONENT_OF_GREEN_MAX
                        && blue >= AppConstants.BLUE_COMPONENT_OF_GREEN_MIN && blue <= AppConstants.BLUE_COMPONENT_OF_GREEN_MAX
                        && greenColorBean == null) {
                   
                    redPixelCount = 0;
                    bluePixelCount = 0;
                    currentpixelHeight = i / width;
                    currentPixelWidth = i % width;
                    if (currentpixelHeight != previousGreenPixelHeight) {
                        greenPixelCount = 1;
                    } else if (currentPixelWidth == previousGreenPixelWidth + 1) {
                        greenPixelCount++;
                    } else {
                        greenPixelCount = 1;
                    }

                    if (greenPixelCount >= AppConstants.THRESHOLD_COLOR_COUNT) {
                        greenColorBean = new ColorBean1();
                        greenColorBean.setColor("GREEN");
                        greenColorBean.setStartingPixelWidth((currentPixelWidth
                                - AppConstants.THRESHOLD_COLOR_COUNT) + 1);
                        greenColorBean.setEndingPixelWidth(currentPixelWidth);
                        greenColorBean.setPixelHeight(currentpixelHeight);

                        
                        colorBeans.add(greenColorBean);
                        
                    }

                    previousGreenPixelHeight = currentpixelHeight;
                    previousGreenPixelWidth = currentPixelWidth;
                    
                } else if (red >= AppConstants.RED_COMPONENT_OF_BLUE_MIN && red <= AppConstants.RED_COMPONENT_OF_BLUE_MAX
                        && green >= AppConstants.GREEN_COMPONENT_OF_BLUE_MIN && green <= AppConstants.GREEN_COMPONENT_OF_BLUE_MAX
                        && blue >= AppConstants.BLUE_COMPONENT_OF_BLUE_MIN && blue <= AppConstants.BLUE_COMPONENT_OF_BLUE_MAX
                        && blueColorBean == null) {
                    
                    redPixelCount = 0;
                    greenPixelCount = 0;
                    currentpixelHeight = i / width;
                    currentPixelWidth = i % width;
                    if (currentpixelHeight != previousBluePixelHeight) {
                        bluePixelCount = 1;
                    } else if (currentPixelWidth == previousBluePixelWidth + 1) {
                        bluePixelCount++;
                    } else {
                        bluePixelCount = 1;
                    }

                    if (bluePixelCount >= AppConstants.THRESHOLD_COLOR_COUNT) {
                        blueColorBean = new ColorBean1();
                        System.out.println(" continous Blue Detected");
                        blueColorBean.setColor("BLUE");
                        blueColorBean.setStartingPixelWidth((currentPixelWidth
                                - AppConstants.THRESHOLD_COLOR_COUNT) + 1);
                        blueColorBean.setEndingPixelWidth(currentPixelWidth);
                        blueColorBean.setPixelHeight(currentpixelHeight);

                        
                        colorBeans.add(blueColorBean);
                        
                    }

                    previousBluePixelHeight = currentpixelHeight;
                    previousBluePixelWidth = currentPixelWidth;
                 
                }
            }
                        return colorBeans;
                        }