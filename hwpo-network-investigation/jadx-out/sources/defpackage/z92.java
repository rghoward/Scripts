package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z92 implements aa2.a {
    @Override // aa2.a
    public final Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        List listD = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listD != null) {
                    return new pd0(iNextInt, strNextString, listD);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" name");
                }
                if ((b & 1) == 0) {
                    sb.append(" importance");
                }
                if (listD == null) {
                    sb.append(" frames");
                }
                aa0.c(v92.a("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = aa2.d(jsonReader, new mz());
                    if (listD == null) {
                        ac4.c("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null name");
                        return null;
                    }
                    break;
                    break;
                case "importance":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
