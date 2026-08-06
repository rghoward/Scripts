package defpackage;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fz implements aa2.a, ojb {
    public static String c(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.ojb
    public mva a(iw iwVar) {
        return new mva(iwVar, ag7.a.a);
    }

    @Override // aa2.a
    public Object b(JsonReader jsonReader) throws IOException {
        ud0.a aVar = new ud0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null parameterKey");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "templateVersion":
                    aVar.d = jsonReader.nextLong();
                    aVar.e = (byte) (aVar.e | 1);
                    break;
                case "rolloutVariant":
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("variantId")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                ac4.c("Null variantId");
                                return null;
                            }
                        } else if (strNextName2.equals("rolloutId")) {
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                ac4.c("Null rolloutId");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString2 != null && strNextString3 != null) {
                        aVar.a = new vd0(strNextString2, strNextString3);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (strNextString2 == null) {
                            sb.append(" rolloutId");
                        }
                        if (strNextString3 == null) {
                            sb.append(" variantId");
                        }
                        aa0.c(v92.a("Missing required properties:", sb));
                        return null;
                    }
                    break;
                case "parameterValue":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        ac4.c("Null parameterValue");
                        return null;
                    }
                    aVar.c = strNextString4;
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }
}
