package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 {
    public static final cm5 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T> {
        T b(JsonReader jsonReader);
    }

    static {
        dm5 dm5Var = new dm5();
        ya0 ya0Var = ya0.a;
        dm5Var.a(u92.class, ya0Var);
        dm5Var.a(yc0.class, ya0Var);
        eb0 eb0Var = eb0.a;
        dm5Var.a(u92.e.class, eb0Var);
        dm5Var.a(fd0.class, eb0Var);
        bb0 bb0Var = bb0.a;
        dm5Var.a(u92.e.a.class, bb0Var);
        dm5Var.a(gd0.class, bb0Var);
        cb0 cb0Var = cb0.a;
        dm5Var.a(u92.e.a.AbstractC0256a.class, cb0Var);
        dm5Var.a(hd0.class, cb0Var);
        ub0 ub0Var = ub0.a;
        dm5Var.a(u92.e.f.class, ub0Var);
        dm5Var.a(yd0.class, ub0Var);
        tb0 tb0Var = tb0.a;
        dm5Var.a(u92.e.AbstractC0266e.class, tb0Var);
        dm5Var.a(xd0.class, tb0Var);
        db0 db0Var = db0.a;
        dm5Var.a(u92.e.c.class, db0Var);
        dm5Var.a(id0.class, db0Var);
        ob0 ob0Var = ob0.a;
        dm5Var.a(u92.e.d.class, ob0Var);
        dm5Var.a(jd0.class, ob0Var);
        fb0 fb0Var = fb0.a;
        dm5Var.a(u92.e.d.a.class, fb0Var);
        dm5Var.a(kd0.class, fb0Var);
        hb0 hb0Var = hb0.a;
        dm5Var.a(u92.e.d.a.b.class, hb0Var);
        dm5Var.a(ld0.class, hb0Var);
        kb0 kb0Var = kb0.a;
        dm5Var.a(u92.e.d.a.b.AbstractC0260d.class, kb0Var);
        dm5Var.a(pd0.class, kb0Var);
        lb0 lb0Var = lb0.a;
        dm5Var.a(u92.e.d.a.b.AbstractC0260d.AbstractC0261a.class, lb0Var);
        dm5Var.a(qd0.class, lb0Var);
        ib0 ib0Var = ib0.a;
        dm5Var.a(u92.e.d.a.b.AbstractC0259b.class, ib0Var);
        dm5Var.a(nd0.class, ib0Var);
        wa0 wa0Var = wa0.a;
        dm5Var.a(u92.a.class, wa0Var);
        dm5Var.a(ad0.class, wa0Var);
        va0 va0Var = va0.a;
        dm5Var.a(u92.a.AbstractC0255a.class, va0Var);
        dm5Var.a(bd0.class, va0Var);
        jb0 jb0Var = jb0.a;
        dm5Var.a(u92.e.d.a.b.c.class, jb0Var);
        dm5Var.a(od0.class, jb0Var);
        gb0 gb0Var = gb0.a;
        dm5Var.a(u92.e.d.a.b.AbstractC0258a.class, gb0Var);
        dm5Var.a(md0.class, gb0Var);
        xa0 xa0Var = xa0.a;
        dm5Var.a(u92.c.class, xa0Var);
        dm5Var.a(cd0.class, xa0Var);
        mb0 mb0Var = mb0.a;
        dm5Var.a(u92.e.d.a.c.class, mb0Var);
        dm5Var.a(rd0.class, mb0Var);
        nb0 nb0Var = nb0.a;
        dm5Var.a(u92.e.d.c.class, nb0Var);
        dm5Var.a(sd0.class, nb0Var);
        pb0 pb0Var = pb0.a;
        dm5Var.a(u92.e.d.AbstractC0264d.class, pb0Var);
        dm5Var.a(td0.class, pb0Var);
        sb0 sb0Var = sb0.a;
        dm5Var.a(u92.e.d.f.class, sb0Var);
        dm5Var.a(wd0.class, sb0Var);
        qb0 qb0Var = qb0.a;
        dm5Var.a(u92.e.d.AbstractC0265e.class, qb0Var);
        dm5Var.a(ud0.class, qb0Var);
        rb0 rb0Var = rb0.a;
        dm5Var.a(u92.e.d.AbstractC0265e.b.class, rb0Var);
        dm5Var.a(vd0.class, rb0Var);
        za0 za0Var = za0.a;
        dm5Var.a(u92.d.class, za0Var);
        dm5Var.a(dd0.class, za0Var);
        ab0 ab0Var = ab0.a;
        dm5Var.a(u92.d.a.class, ab0Var);
        dm5Var.a(ed0.class, ab0Var);
        dm5Var.d = true;
        a = new cm5(dm5Var);
    }

    public static qd0 a(JsonReader jsonReader) throws IOException {
        qd0.a aVar = new qd0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    aVar.d = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null symbol");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "pc":
                    aVar.a = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 1);
                    break;
                case "file":
                    aVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.e = jsonReader.nextInt();
                    aVar.f = (byte) (aVar.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static cd0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ac4.c("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    ac4.c("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new cd0(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        aa0.c(v92.a("Missing required properties:", sb));
        return null;
    }

    public static ad0 c(JsonReader jsonReader) throws IOException {
        ad0.a aVar = new ad0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    aVar.i = d(jsonReader, new x92());
                    break;
                case "pid":
                    aVar.a = jsonReader.nextInt();
                    aVar.j = (byte) (aVar.j | 1);
                    break;
                case "pss":
                    aVar.e = jsonReader.nextLong();
                    aVar.j = (byte) (aVar.j | 8);
                    break;
                case "rss":
                    aVar.f = jsonReader.nextLong();
                    aVar.j = (byte) (aVar.j | 16);
                    break;
                case "timestamp":
                    aVar.g = jsonReader.nextLong();
                    aVar.j = (byte) (aVar.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null processName");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    aVar.c = jsonReader.nextInt();
                    aVar.j = (byte) (aVar.j | 2);
                    break;
                case "traceFile":
                    aVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.d = jsonReader.nextInt();
                    aVar.j = (byte) (aVar.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> List<T> d(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.b(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x024c  */
    /* JADX WARN: Code duplicated, block: B:242:0x03be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [nd0] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [u92$a] */
    /* JADX WARN: Type inference failed for: r24v2, types: [ad0] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [od0] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static jd0 e(JsonReader jsonReader) throws IOException {
        byte b;
        jd0.a aVar = new jd0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            jd0 jd0Var = null;
            switch (b) {
                case 0:
                    sd0.a aVar2 = new sd0.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                aVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                aVar2.b = jsonReader.nextInt();
                                aVar2.g = (byte) (aVar2.g | 1);
                                break;
                            case "orientation":
                                aVar2.d = jsonReader.nextInt();
                                aVar2.g = (byte) (aVar2.g | 4);
                                break;
                            case "diskUsed":
                                aVar2.f = jsonReader.nextLong();
                                aVar2.g = (byte) (aVar2.g | 16);
                                break;
                            case "ramUsed":
                                aVar2.e = jsonReader.nextLong();
                                aVar2.g = (byte) (aVar2.g | 8);
                                break;
                            case "proximityOn":
                                aVar2.c = jsonReader.nextBoolean();
                                aVar2.g = (byte) (aVar2.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.d = aVar2.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listD = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listD = d(jsonReader, new fz());
                            if (listD == null) {
                                ac4.c("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        aa0.c("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    aVar.f = new wd0(listD);
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    ld0 ld0Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    rd0 rd0VarG = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (true) {
                        jd0 jd0Var2 = jd0Var;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && ld0Var != null) {
                                aVar.c = new kd0(ld0Var, listUnmodifiableList, listUnmodifiableList2, boolValueOf, rd0VarG, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (ld0Var == null) {
                                sb.append(" execution");
                            }
                            if (!z) {
                                sb.append(" uiOrientation");
                            }
                            aa0.c(v92.a("Missing required properties:", sb));
                            return jd0Var2;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                jd0Var = jd0Var2;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                jd0Var = jd0Var2;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? D = jd0Var2;
                                ?? F = D;
                                ?? C = F;
                                ?? od0Var = C;
                                ?? r26 = od0Var;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            C = c(jsonReader);
                                            break;
                                        case "threads":
                                            D = d(jsonReader, new z92());
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b2 = 0;
                                            ?? NextString = jd0Var2;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b2 = (byte) (b2 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            ac4.c("Null code");
                                                            return jd0Var2;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            ac4.c("Null name");
                                                            return jd0Var2;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 == 1 && NextString != 0 && NextString2 != 0) {
                                                od0Var = new od0(NextString, NextString2, jNextLong);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                aa0.c(v92.a("Missing required properties:", sb2));
                                                return jd0Var2;
                                            }
                                            break;
                                        case "binaries":
                                            List listD2 = d(jsonReader, new lz());
                                            F = F;
                                            r26 = listD2;
                                            if (listD2 == null) {
                                                ac4.c("Null binaries");
                                                return jd0Var2;
                                            }
                                            break;
                                        case "exception":
                                            F = f(jsonReader);
                                            r26 = r26;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            F = F;
                                            r26 = r26;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (od0Var != 0 && r26 != 0) {
                                    ld0Var = new ld0(D, F, C, od0Var, r26);
                                    jd0Var = jd0Var2;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (od0Var == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r26 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    aa0.c(v92.a("Missing required properties:", sb3));
                                    return jd0Var2;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                jd0Var = jd0Var2;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                jd0Var = jd0Var2;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                jd0Var = jd0Var2;
                                break;
                            case "currentProcessDetails":
                                rd0VarG = g(jsonReader);
                                jd0Var = jd0Var2;
                                break;
                            default:
                                jsonReader.skipValue();
                                jd0Var = jd0Var2;
                                break;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                ac4.c("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        aa0.c("Missing required properties: content");
                        return null;
                    }
                    aVar.e = new td0(strNextString);
                    break;
                    break;
                case 4:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        ac4.c("Null type");
                        return null;
                    }
                    aVar.b = strNextString2;
                    break;
                    break;
                case 5:
                    aVar.a = jsonReader.nextLong();
                    aVar.g = (byte) (aVar.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static nd0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listD = null;
        nd0 nd0VarF = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listD != null) {
                    return new nd0(strNextString, strNextString2, listD, nd0VarF, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listD == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                aa0.c(v92.a("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = d(jsonReader, new mz());
                    if (listD == null) {
                        ac4.c("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    nd0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static rd0 g(JsonReader jsonReader) throws IOException {
        rd0.a aVar = new rd0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    aVar.b = jsonReader.nextInt();
                    aVar.e = (byte) (aVar.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ac4.c("Null processName");
                        return null;
                    }
                    aVar.a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    aVar.d = jsonReader.nextBoolean();
                    aVar.e = (byte) (aVar.e | 4);
                    break;
                case "importance":
                    aVar.c = jsonReader.nextInt();
                    aVar.e = (byte) (aVar.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0256  */
    public static yc0 h(JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = u92.a;
        yc0.a aVar = new yc0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listD = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listD = d(jsonReader, new y92());
                            if (listD == null) {
                                ac4.c("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        aa0.c("Missing required properties: files");
                        return null;
                    }
                    aVar.k = new dd0(listD, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        ac4.c("Null sdkVersion");
                        return null;
                    }
                    aVar.a = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    aVar.g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    aVar.l = c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        ac4.c("Null buildVersion");
                        return null;
                    }
                    aVar.h = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    aVar.f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        ac4.c("Null gmpAppId");
                        return null;
                    }
                    aVar.b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        ac4.c("Null installationUuid");
                        return null;
                    }
                    aVar.d = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    aVar.e = jsonReader.nextString();
                    break;
                case "platform":
                    aVar.c = jsonReader.nextInt();
                    aVar.m = (byte) (aVar.m | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        ac4.c("Null displayVersion");
                        return null;
                    }
                    aVar.i = strNextString6;
                    break;
                    break;
                case "session":
                    fd0.a aVar2 = new fd0.a();
                    aVar2.f = false;
                    aVar2.m = (byte) (aVar2.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                aVar2.d = jsonReader.nextLong();
                                aVar2.m = (byte) (aVar2.m | 1);
                                break;
                            case "appQualitySessionId":
                                aVar2.c = jsonReader.nextString();
                                break;
                            case "identifier":
                                aVar2.b = new String(Base64.decode(jsonReader.nextString(), 2), u92.a);
                                break;
                            case "endedAt":
                                aVar2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                id0.a aVar3 = new id0.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            aVar3.f = jsonReader.nextBoolean();
                                            aVar3.j = (byte) (aVar3.j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                ac4.c("Null manufacturer");
                                                return null;
                                            }
                                            aVar3.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            aVar3.d = jsonReader.nextLong();
                                            aVar3.j = (byte) (aVar3.j | 4);
                                            break;
                                        case "arch":
                                            aVar3.a = jsonReader.nextInt();
                                            aVar3.j = (byte) (aVar3.j | 1);
                                            break;
                                        case "diskSpace":
                                            aVar3.e = jsonReader.nextLong();
                                            aVar3.j = (byte) (aVar3.j | 8);
                                            break;
                                        case "cores":
                                            aVar3.c = jsonReader.nextInt();
                                            aVar3.j = (byte) (aVar3.j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                ac4.c("Null model");
                                                return null;
                                            }
                                            aVar3.b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            aVar3.g = jsonReader.nextInt();
                                            aVar3.j = (byte) (aVar3.j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                ac4.c("Null modelClass");
                                                return null;
                                            }
                                            aVar3.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.j = aVar3.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                aVar2.k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                xd0.a aVar4 = new xd0.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                ac4.c("Null buildVersion");
                                                return null;
                                            }
                                            aVar4.c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            aVar4.d = jsonReader.nextBoolean();
                                            aVar4.e = (byte) (aVar4.e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                ac4.c("Null version");
                                                return null;
                                            }
                                            aVar4.b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            aVar4.a = jsonReader.nextInt();
                                            aVar4.e = (byte) (aVar4.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.i = aVar4.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            if (!strNextName6.equals("identifier")) {
                                                b = -1;
                                            } else {
                                                b = 0;
                                            }
                                            break;
                                        case -519438642:
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b = -1;
                                            } else {
                                                b = 2;
                                            }
                                            break;
                                        case 351608024:
                                            b = !strNextName6.equals("version") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 719853845:
                                            b = !strNextName6.equals("installationUuid") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 1975623094:
                                            b = !strNextName6.equals("displayVersion") ? (byte) -1 : (byte) 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            strNextString17 = jsonReader.nextString();
                                            if (strNextString17 == null) {
                                                ac4.c("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 1:
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                ac4.c("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 4:
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 != null && strNextString12 != null) {
                                    aVar2.g = new gd0(strNextString17, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString17 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    aa0.c(v92.a("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            ac4.c("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    aa0.c("Missing required properties: identifier");
                                    return null;
                                }
                                aVar2.h = new yd0(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    ac4.c("Null generator");
                                    return null;
                                }
                                aVar2.a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                aVar2.f = jsonReader.nextBoolean();
                                aVar2.m = (byte) (aVar2.m | 2);
                                break;
                            case "generatorType":
                                aVar2.l = jsonReader.nextInt();
                                aVar2.m = (byte) (aVar2.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.j = aVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static yc0 i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                yc0 yc0VarH = h(jsonReader);
                jsonReader.close();
                return yc0VarH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
