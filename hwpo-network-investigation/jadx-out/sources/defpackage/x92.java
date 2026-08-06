package defpackage;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x92 implements aa2.a {
    @Override // aa2.a
    public final Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        ac4.c("Null libraryName");
                        return null;
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null arch");
                        return null;
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        ac4.c("Null buildId");
                        return null;
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null && strNextString3 != null) {
            return new bd0(strNextString, strNextString2, strNextString3);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" arch");
        }
        if (strNextString2 == null) {
            sb.append(" libraryName");
        }
        if (strNextString3 == null) {
            sb.append(" buildId");
        }
        aa0.c(v92.a("Missing required properties:", sb));
        return null;
    }
}
