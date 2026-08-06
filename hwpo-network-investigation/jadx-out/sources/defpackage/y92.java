package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y92 implements aa2.a {
    public static /* synthetic */ void a(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // aa2.a
    public Object b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ac4.c("Null filename");
                    return null;
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    ac4.c("Null contents");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && bArrDecode != null) {
            return new ed0(strNextString, bArrDecode);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" filename");
        }
        if (bArrDecode == null) {
            sb.append(" contents");
        }
        aa0.c(v92.a("Missing required properties:", sb));
        return null;
    }
}
