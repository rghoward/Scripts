package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lz implements aa2.a {
    public static void c(int i, int i2, int i3, int i4, int i5) {
        ds6.b(i);
        ds6.b(i2);
        ds6.b(i3);
        ds6.b(i4);
        ds6.b(i5);
    }

    @Override // aa2.a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String str = null;
        long jNextLong = 0;
        long jNextLong2 = 0;
        byte b = 0;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 3 && strNextString != null) {
                    return new md0(jNextLong, jNextLong2, strNextString, str);
                }
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" baseAddress");
                }
                if ((b & 2) == 0) {
                    sb.append(" size");
                }
                if (strNextString == null) {
                    sb.append(" name");
                }
                aa0.c(v92.a("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null name");
                        return null;
                    }
                    break;
                    break;
                case "size":
                    jNextLong2 = jsonReader.nextLong();
                    b = (byte) (b | 2);
                    break;
                case "uuid":
                    str = new String(Base64.decode(jsonReader.nextString(), 2), u92.a);
                    break;
                case "baseAddress":
                    b = (byte) (b | 1);
                    jNextLong = jsonReader.nextLong();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
