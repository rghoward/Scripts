package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        i4.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        i4.a(-983041, map, "azure", -657956, "beige");
        i4.a(-6972, map, "bisque", -16777216, "black");
        i4.a(-5171, map, "blanchedalmond", -16776961, "blue");
        i4.a(-7722014, map, "blueviolet", -5952982, "brown");
        i4.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        i4.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        i4.a(-32944, map, "coral", -10185235, "cornflowerblue");
        i4.a(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        i4.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        i4.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        i4.a(-29696, map, "darkorange", -6737204, "darkorchid");
        i4.a(-7667712, map, "darkred", -1468806, "darksalmon");
        i4.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        i4.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        i4.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        i4.a(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        i4.a(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        i4.a(-38476, map, "hotpink", -3318692, "indianred");
        i4.a(-11861886, map, "indigo", -16, "ivory");
        i4.a(-989556, map, "khaki", -1644806, "lavender");
        i4.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        i4.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        i4.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        i4.a(-18751, map, "lightpink", -24454, "lightsalmon");
        i4.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        i4.a(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        i4.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        i4.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        i4.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        i4.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        i4.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        i4.a(-15132304, map, "midnightblue", -655366, "mintcream");
        i4.a(-6943, map, "mistyrose", -6987, "moccasin");
        i4.a(-8531, map, "navajowhite", -16777088, "navy");
        i4.a(-133658, map, "oldlace", -8355840, "olive");
        i4.a(-9728477, map, "olivedrab", -23296, "orange");
        i4.a(-47872, map, "orangered", -2461482, "orchid");
        i4.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        i4.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        i4.a(-4139, map, "papayawhip", -9543, "peachpuff");
        i4.a(-3308225, map, "peru", -16181, "pink");
        i4.a(-2252579, map, "plum", -5185306, "powderblue");
        i4.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        i4.a(-65536, map, "red", -4419697, "rosybrown");
        i4.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        i4.a(-360334, map, "salmon", -744352, "sandybrown");
        i4.a(-13726889, map, "seagreen", -2578, "seashell");
        i4.a(-6270419, map, "sienna", -4144960, "silver");
        i4.a(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        i4.a(-12156236, map, "steelblue", -2968436, "tan");
        i4.a(-16744320, map, "teal", -2572328, "thistle");
        i4.a(-40121, map, "tomato", 0, "transparent");
        i4.a(-12525360, map, "turquoise", -1146130, "violet");
        i4.a(-663885, map, "wheat", -1, "white");
        i4.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int i;
        xl7.g(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", BuildConfig.FLAVOR);
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            zn3.b();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(h40.f(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        zn3.b();
        return 0;
    }
}
