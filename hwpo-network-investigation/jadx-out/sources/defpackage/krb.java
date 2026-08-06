package defpackage;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class krb {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static qy6 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!ym.g(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ut7.a(null, "Couldn't find xmp metadata");
        }
        k95.b bVar = k95.u;
        ul8 ul8VarB = ul8.x;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (ym.g(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strD = ym.d(xmlPullParserNewPullParser, a[i2]);
                    if (strD != null) {
                        if (Integer.parseInt(strD) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strD2 = ym.d(xmlPullParserNewPullParser, b[i3]);
                                if (strD2 != null) {
                                    j = Long.parseLong(strD2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                k95.b bVar2 = k95.u;
                                ul8VarB = ul8.x;
                                break;
                            }
                            String strD3 = ym.d(xmlPullParserNewPullParser, c[i]);
                            if (strD3 != null) {
                                ul8VarB = k95.w(new qy6.a("image/jpeg", 0L, 0L), new qy6.a("video/mp4", Long.parseLong(strD3), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (ym.g(xmlPullParserNewPullParser, "Container:Directory")) {
                ul8VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (ym.g(xmlPullParserNewPullParser, "GContainer:Directory")) {
                ul8VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!ym.f(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (ul8VarB.isEmpty()) {
            break loop0;
        }
        return new qy6(j, ul8VarB);
        return null;
    }

    public static ul8 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (ym.g(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strD = ym.d(xmlPullParser, strConcat3);
                String strD2 = ym.d(xmlPullParser, strConcat4);
                String strD3 = ym.d(xmlPullParser, strConcat5);
                String strD4 = ym.d(xmlPullParser, strConcat6);
                if (strD == null || strD2 == null) {
                    return ul8.x;
                }
                aVar.c(new qy6.a(strD, strD3 != null ? Long.parseLong(strD3) : 0L, strD4 != null ? Long.parseLong(strD4) : 0L));
            }
        } while (!ym.f(xmlPullParser, strConcat2));
        return aVar.g();
    }
}
