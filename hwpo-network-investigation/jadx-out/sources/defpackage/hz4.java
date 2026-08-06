package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hz4 implements vt7.a<gz4> {
    public final fz4 a;
    public final dz4 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern p = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern q = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern r = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern s = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern t = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern u = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern w = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern x = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern y = b("CAN-SKIP-DATERANGES");
    public static final Pattern z = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern A = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern B = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern C = b("CAN-BLOCK-RELOAD");
    public static final Pattern D = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern G = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern I = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern K = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern L = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern M = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern N = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern O = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern P = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern Q = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern R = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern S = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern T = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern U = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern W = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern X = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Y = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern a0 = b("AUTOSELECT");
    public static final Pattern b0 = b("DEFAULT");
    public static final Pattern c0 = b("FORCED");
    public static final Pattern d0 = b("INDEPENDENT");
    public static final Pattern e0 = b("GAP");
    public static final Pattern f0 = b("PRECISE");
    public static final Pattern g0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern k0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern l0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern o0 = b("END-ON-NEXT");
    public static final Pattern p0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern s0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern t0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern z0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern A0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern B0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern C0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends IOException {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final BufferedReader a;
        public final ArrayDeque b;
        public String c;

        public b(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.b = arrayDeque;
            this.a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String strTrim;
            if (this.c == null) {
                ArrayDeque arrayDeque = this.b;
                if (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    str.getClass();
                    this.c = str;
                    return true;
                }
                do {
                    String line = this.a.readLine();
                    this.c = line;
                    if (line == null) {
                        return false;
                    }
                    strTrim = line.trim();
                    this.c = strTrim;
                } while (strTrim.isEmpty());
            }
            return true;
        }

        public final String b() {
            if (!a()) {
                vl.b();
                return null;
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends LinkedHashMap<Pattern, Matcher> {
        public static Matcher a(c cVar, String str, Pattern pattern) {
            Matcher matcher = cVar.get(pattern);
            if (matcher != null) {
                matcher.reset(str);
                return matcher;
            }
            Matcher matcher2 = pattern.matcher(str);
            cVar.put(pattern, matcher2);
            return matcher2;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Pattern, Matcher> entry) {
            return size() > 32;
        }
    }

    public hz4(fz4 fz4Var, dz4 dz4Var) {
        this.a = fz4Var;
        this.b = dz4Var;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static h83 c(String str, h83.b[] bVarArr) {
        h83.b[] bVarArr2 = new h83.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            h83.b bVar = bVarArr[i2];
            bVarArr2[i2] = new h83.b(bVar.u, bVar.v, bVar.w, null);
        }
        return new h83(str, true, bVarArr2);
    }

    public static h83.b d(String str, String str2, HashMap map, c cVar) throws ut7 {
        String strJ = j(str, P, "1", map, cVar);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = Q;
        if (zEquals) {
            String strK = k(str, pattern, map, cVar);
            return new h83.b(i01.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = i01.d;
            String str3 = n6b.a;
            return new h83.b(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map, cVar);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = i01.e;
        int length = (bArrDecode != null ? bArrDecode.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
        if (bArrDecode == null || bArrDecode.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArrDecode.length);
            byteBufferAllocate.put(bArrDecode);
        }
        return new h83.b(uuid2, null, "video/mp4", byteBufferAllocate.array());
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static defpackage.dz4 e(defpackage.fz4 r140, defpackage.dz4 r141, hz4.b r142, android.net.Uri r143, hz4.c r144) {
        /*
            Method dump skipped, instruction units count: 4792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz4.e(fz4, dz4, hz4$b, android.net.Uri, hz4$c):dz4");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:104:0x025e  */
    /* JADX WARN: Code duplicated, block: B:107:0x026e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0277  */
    /* JADX WARN: Code duplicated, block: B:111:0x0279  */
    /* JADX WARN: Code duplicated, block: B:113:0x0283  */
    /* JADX WARN: Code duplicated, block: B:115:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x0298  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02af  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x0314  */
    /* JADX WARN: Code duplicated, block: B:142:0x031f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0325  */
    /* JADX WARN: Code duplicated, block: B:147:0x0376  */
    /* JADX WARN: Code duplicated, block: B:197:0x0530  */
    /* JADX WARN: Code duplicated, block: B:291:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01da  */
    /* JADX WARN: Code duplicated, block: B:82:0x0211  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [int] */
    /* JADX WARN: Type inference failed for: r5v70 */
    public static fz4 f(b bVar, Uri uri, c cVar) throws IOException {
        ?? r28;
        int i2;
        ArrayList arrayList;
        fz4.b bVar2;
        String strD;
        char c2;
        int i3;
        String str;
        fz4.b bVar3;
        String strD2;
        fz4.b bVar4;
        int i4;
        int i5;
        String str2;
        String str3;
        String strU;
        ArrayList arrayList2;
        int i6;
        int i7;
        int i8;
        int i9;
        xh1 xh1Var;
        String[] strArrX;
        StringBuilder sb;
        int length;
        int i10;
        String string;
        String str4;
        xh1 xh1Var2;
        String strJ;
        int i11;
        int i12;
        String strJ2;
        float f2;
        Uri uriD;
        Uri uri2;
        ArrayList arrayList3;
        HashMap map;
        ArrayList arrayList4;
        String string2 = uri.toString();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean zA = bVar.a();
            Pattern pattern = Q;
            ArrayList arrayList13 = arrayList9;
            boolean zContains = z2;
            Pattern pattern2 = V;
            boolean z4 = z3;
            if (!zA) {
                ArrayList arrayList14 = arrayList5;
                HashMap map4 = map2;
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList6;
                ArrayList arrayList18 = arrayList7;
                ArrayList arrayList19 = arrayList8;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i13 = 0;
                while (i13 < arrayList14.size()) {
                    fz4.b bVar5 = (fz4.b) arrayList14.get(i13);
                    Uri uri3 = bVar5.a;
                    id4 id4Var = bVar5.b;
                    if (hashSet.add(uri3)) {
                        xl7.r(id4Var.l == null);
                        ArrayList arrayList22 = (ArrayList) map4.get(bVar5.a);
                        arrayList22.getClass();
                        su6 su6Var = new su6(new qz4(null, null, arrayList22));
                        id4.a aVarA = id4Var.a();
                        aVarA.k = su6Var;
                        arrayList21.add(new fz4.b(bVar5.a, new id4(aVarA), bVar5.c, bVar5.d, bVar5.e, bVar5.f, bVar5.g, bVar5.h));
                    }
                    i13++;
                    hashSet = hashSet;
                    map4 = map4;
                }
                int i14 = 0;
                ArrayList arrayList23 = null;
                id4 id4Var2 = null;
                while (i14 < arrayList15.size()) {
                    ArrayList arrayList24 = arrayList15;
                    String str5 = (String) arrayList24.get(i14);
                    String strK = k(str5, X, map3, cVar);
                    String strK2 = k(str5, pattern2, map3, cVar);
                    ArrayList arrayList25 = arrayList23;
                    ArrayList arrayList26 = arrayList21;
                    String strJ3 = j(str5, q, null, map3, cVar);
                    id4.a aVar = new id4.a();
                    id4 id4Var3 = id4Var2;
                    aVar.a = cj2.a(strK, ":", strK2);
                    aVar.b = strK2;
                    aVar.m = fv6.n("application/x-mpegURL");
                    boolean zG = g(cVar, str5, b0);
                    if (g(cVar, str5, c0)) {
                        r28 = zG;
                        r28 = (zG ? 1 : 0) | 2;
                    }
                    r28 = zG;
                    aVar.e = g(cVar, str5, a0) ? r28 | 4 : r28;
                    int i15 = i14;
                    String strJ4 = j(str5, Y, null, map3, cVar);
                    if (TextUtils.isEmpty(strJ4)) {
                        arrayList15 = arrayList24;
                        i2 = 0;
                    } else {
                        String str6 = n6b.a;
                        String[] strArrSplit = strJ4.split(",", -1);
                        i2 = n6b.l("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        arrayList15 = arrayList24;
                        if (n6b.l("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i2 |= 4096;
                        }
                        if (n6b.l("public.accessibility.describes-music-and-sound", strArrSplit)) {
                            i2 |= 1024;
                        }
                        if (n6b.l("public.easy-to-read", strArrSplit)) {
                            i2 |= 8192;
                        }
                    }
                    aVar.f = i2;
                    aVar.d = j(str5, U, null, map3, cVar);
                    String strJ5 = j(str5, pattern, null, map3, cVar);
                    Uri uriD2 = strJ5 == null ? null : a5b.d(string2, strJ5);
                    String str7 = string2;
                    Pattern pattern3 = pattern;
                    su6 su6Var2 = new su6(new qz4(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str5, S, map3, cVar)) {
                        case "SUBTITLES":
                            arrayList = arrayList17;
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList14.size()) {
                                    bVar2 = (fz4.b) arrayList14.get(i16);
                                    if (!strK.equals(bVar2.e)) {
                                        i16++;
                                    }
                                } else {
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String strU2 = n6b.u(3, bVar2.b.k);
                                aVar.j = strU2;
                                strD = fv6.d(strU2);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = "text/vtt";
                            }
                            aVar.n = fv6.n(strD);
                            aVar.k = su6Var2;
                            if (uriD2 != null) {
                                arrayList19 = arrayList19;
                                arrayList19.add(new fz4.a(uriD2, new id4(aVar), strK2, strJ3));
                            } else {
                                arrayList19 = arrayList19;
                                md6.g("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList23 = arrayList25;
                            id4Var2 = id4Var3;
                            break;
                        case "CLOSED-CAPTIONS":
                            ArrayList arrayList27 = arrayList18;
                            arrayList = arrayList17;
                            String strK3 = k(str5, Z, map3, cVar);
                            if (strK3.startsWith("CC")) {
                                i3 = Integer.parseInt(strK3.substring(2));
                                str = "application/cea-608";
                                c2 = 7;
                            } else {
                                c2 = 7;
                                i3 = Integer.parseInt(strK3.substring(7));
                                str = "application/cea-708";
                            }
                            ArrayList arrayList28 = arrayList25 == null ? new ArrayList() : arrayList25;
                            aVar.n = fv6.n(str);
                            aVar.K = i3;
                            arrayList28.add(new id4(aVar));
                            arrayList18 = arrayList27;
                            arrayList23 = arrayList28;
                            arrayList19 = arrayList19;
                            id4Var2 = id4Var3;
                            break;
                        case "AUDIO":
                            arrayList = arrayList17;
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList14.size()) {
                                    bVar3 = (fz4.b) arrayList14.get(i17);
                                    int i18 = i17;
                                    if (!strK.equals(bVar3.d)) {
                                        i17 = i18 + 1;
                                    }
                                } else {
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                String strU3 = n6b.u(1, bVar3.b.k);
                                aVar.j = strU3;
                                strD2 = fv6.d(strU3);
                            } else {
                                strD2 = null;
                            }
                            fz4.b bVar6 = bVar3;
                            String strJ6 = j(str5, i, null, map3, cVar);
                            if (strJ6 != null) {
                                String str8 = n6b.a;
                                aVar.F = Integer.parseInt(strJ6.split(AgentHeaderCreator.AGENT_DIVIDER, 2)[0]);
                                if ("audio/eac3".equals(strD2) && strJ6.endsWith("/JOC")) {
                                    aVar.j = "ec+3";
                                    strD2 = "audio/eac3-joc";
                                }
                            }
                            aVar.n = fv6.n(strD2);
                            if (uriD2 == null) {
                                ArrayList arrayList29 = arrayList18;
                                if (bVar6 != null) {
                                    id4Var2 = new id4(aVar);
                                    arrayList18 = arrayList29;
                                    arrayList19 = arrayList19;
                                    arrayList23 = arrayList25;
                                } else {
                                    arrayList18 = arrayList29;
                                }
                                break;
                            } else {
                                aVar.k = su6Var2;
                                arrayList18.add(new fz4.a(uriD2, new id4(aVar), strK2, strJ3));
                            }
                            arrayList23 = arrayList25;
                            id4Var2 = id4Var3;
                            break;
                        case "VIDEO":
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList14.size()) {
                                    bVar4 = (fz4.b) arrayList14.get(i19);
                                    if (!strK.equals(bVar4.c)) {
                                        i19++;
                                    }
                                } else {
                                    bVar4 = null;
                                }
                            }
                            if (bVar4 != null) {
                                id4 id4Var4 = bVar4.b;
                                String strU4 = n6b.u(2, id4Var4.k);
                                aVar.j = strU4;
                                aVar.n = fv6.n(fv6.d(strU4));
                                aVar.u = id4Var4.v;
                                aVar.v = id4Var4.w;
                                aVar.y = id4Var4.z;
                            }
                            if (uriD2 != null) {
                                aVar.k = su6Var2;
                                arrayList = arrayList17;
                                arrayList.add(new fz4.a(uriD2, new id4(aVar), strK2, strJ3));
                            }
                            arrayList23 = arrayList25;
                            id4Var2 = id4Var3;
                        default:
                            arrayList = arrayList17;
                            arrayList23 = arrayList25;
                            id4Var2 = id4Var3;
                            break;
                    }
                    i14 = i15 + 1;
                    arrayList17 = arrayList;
                    arrayList19 = arrayList19;
                    arrayList21 = arrayList26;
                    string2 = str7;
                    pattern = pattern3;
                }
                return new fz4(uri.toString(), arrayList16, arrayList21, arrayList17, arrayList18, arrayList19, arrayList13, id4Var2, zContains ? Collections.EMPTY_LIST : arrayList23, z4, map3, arrayList20);
            }
            String strB = bVar.b();
            ArrayList arrayList30 = arrayList8;
            if (strB.startsWith("#EXT")) {
                arrayList12.add(strB);
            }
            boolean zStartsWith = strB.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList31 = arrayList12;
            if (strB.startsWith("#EXT-X-DEFINE")) {
                String strJ7 = j(strB, pattern2, null, map3, cVar);
                if (strJ7 != null) {
                    m(strJ7, map3);
                    map3.put(strJ7, k(strB, g0, map3, cVar));
                } else {
                    String strK4 = k(strB, W, map3, cVar);
                    m(strK4, map3);
                    String queryParameter = uri.getQueryParameter(strK4);
                    if (queryParameter == null) {
                        throw ut7.b("QUERYPARAM \"" + strK4 + "\" not found in playlist URI");
                    }
                    map3.put(strK4, queryParameter);
                }
            } else {
                if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    ArrayList arrayList32 = arrayList5;
                    map = map2;
                    arrayList3 = arrayList32;
                    arrayList10 = arrayList10;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList11 = arrayList11;
                    z2 = zContains;
                    z3 = true;
                } else if (strB.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strB);
                } else if (strB.startsWith("#EXT-X-SESSION-KEY")) {
                    h83.b bVarD = d(strB, j(strB, O, "identity", map3, cVar), map3, cVar);
                    if (bVarD != null) {
                        String strK5 = k(strB, N, map3, cVar);
                        arrayList11.add(new h83(("SAMPLE-AES-CENC".equals(strK5) || "SAMPLE-AES-CTR".equals(strK5)) ? "cenc" : "cbcs", true, bVarD));
                    }
                } else {
                    if (strB.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        zContains |= strB.contains("CLOSED-CAPTIONS=NONE");
                        int i20 = zStartsWith ? 16384 : 0;
                        int i21 = Integer.parseInt(k(strB, h, Collections.EMPTY_MAP, cVar));
                        Matcher matcherA = c.a(cVar, strB, c);
                        if (matcherA.find()) {
                            String strGroup = matcherA.group(1);
                            strGroup.getClass();
                            i4 = Integer.parseInt(strGroup);
                        } else {
                            i4 = -1;
                        }
                        String strJ8 = j(strB, j, null, map3, cVar);
                        String strJ9 = j(strB, k, null, map3, cVar);
                        String strJ10 = j(strB, l, null, map3, cVar);
                        if (strJ10 != null) {
                            String str9 = n6b.a;
                            String[] strArrSplit2 = strJ10.split(",", 2)[0].split(AgentHeaderCreator.AGENT_DIVIDER, -1);
                            str2 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str3 = strArrSplit2[1];
                                map2 = map2;
                                i5 = 2;
                            } else {
                                i5 = 2;
                            }
                            strU = n6b.u(i5, strJ9);
                            if (fv6.j(strU, str2)) {
                                if (str2 == null) {
                                    arrayList2 = arrayList5;
                                } else {
                                    if (strJ8 != null || str3 == null) {
                                        arrayList2 = arrayList5;
                                    } else {
                                        arrayList2 = arrayList5;
                                        if ((!strJ8.equals("PQ") || str3.equals("db1p")) && ((!strJ8.equals("SDR") || str3.equals("db2g")) && (!strJ8.equals("HLG") || str3.startsWith("db4")))) {
                                        }
                                    }
                                    xh1Var2 = null;
                                }
                                if (strJ9 == null && fv6.j(strJ9, str2)) {
                                    i6 = 6;
                                    if (!strJ9.startsWith("dvhe") || strJ9.startsWith("dvh1") || strJ9.startsWith("dav1")) {
                                        i7 = 6;
                                        i8 = -1;
                                        i9 = 1;
                                    } else if (str3 == null) {
                                        i8 = -1;
                                        i6 = -1;
                                        i9 = -1;
                                        i7 = -1;
                                    } else if (str3.equals("db1p")) {
                                        i7 = 6;
                                        i8 = -1;
                                        i9 = 2;
                                    } else if (str3.startsWith("db4")) {
                                        i8 = -1;
                                        i9 = 2;
                                        i7 = 7;
                                    } else {
                                        i8 = -1;
                                        i6 = -1;
                                        i9 = -1;
                                        i7 = -1;
                                    }
                                    if (i6 == i8) {
                                        xh1Var = null;
                                    } else {
                                        xh1Var = new xh1(i6, i9, i7, -1, -1, null);
                                    }
                                } else {
                                    xh1Var = null;
                                }
                                if (str2 == null) {
                                    str2 = strU;
                                }
                                strArrX = n6b.X(strJ9);
                                if (strArrX.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrX.length;
                                    i10 = 0;
                                    while (i10 < length) {
                                        str4 = strArrX[i10];
                                        String[] strArr = strArrX;
                                        if (2 == fv6.h(fv6.d(str4))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str4);
                                        }
                                        i10++;
                                        strArrX = strArr;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strJ9 = cj2.a(str2, ",", string);
                                } else {
                                    strJ9 = str2;
                                }
                                xh1Var2 = xh1Var;
                            } else {
                                arrayList2 = arrayList5;
                                xh1Var2 = null;
                            }
                            strJ = j(strB, m, null, map3, cVar);
                            if (strJ != null) {
                                String[] strArrSplit3 = strJ.split("x", -1);
                                i12 = Integer.parseInt(strArrSplit3[0]);
                                i11 = Integer.parseInt(strArrSplit3[1]);
                                if (i12 > 0 || i11 <= 0) {
                                    i11 = -1;
                                    i12 = -1;
                                }
                            } else {
                                i11 = -1;
                                i12 = -1;
                            }
                            strJ2 = j(strB, n, null, map3, cVar);
                            if (strJ2 != null) {
                                f2 = Float.parseFloat(strJ2);
                            } else {
                                f2 = -1.0f;
                            }
                            String strJ11 = j(strB, o, null, map3, cVar);
                            String strJ12 = j(strB, d, null, map3, cVar);
                            String strJ13 = j(strB, e, null, map3, cVar);
                            String strJ14 = j(strB, f, null, map3, cVar);
                            String strJ15 = j(strB, g, null, map3, cVar);
                            String strJ16 = j(strB, p, null, map3, cVar);
                            if (zStartsWith) {
                                uriD = a5b.d(string2, k(strB, pattern, map3, cVar));
                            } else {
                                if (bVar.a()) {
                                    throw ut7.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriD = a5b.d(string2, l(bVar.b(), map3, cVar));
                            }
                            uri2 = uriD;
                            id4.a aVar2 = new id4.a();
                            aVar2.a = Integer.toString(arrayList2.size());
                            aVar2.m = fv6.n("application/x-mpegURL");
                            aVar2.j = strJ9;
                            aVar2.h = i4;
                            aVar2.i = i21;
                            aVar2.u = i12;
                            aVar2.v = i11;
                            aVar2.y = f2;
                            aVar2.f = i20;
                            aVar2.D = xh1Var2;
                            arrayList3 = arrayList2;
                            arrayList3.add(new fz4.b(uri2, new id4(aVar2), strJ12, strJ13, strJ14, strJ15, strJ11, strJ16));
                            map = map2;
                            arrayList4 = (ArrayList) map.get(uri2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri2, arrayList4);
                            }
                            arrayList4.add(new qz4.a(strJ12, strJ13, strJ14, strJ15, i4, i21));
                        } else {
                            i5 = 2;
                            str2 = null;
                        }
                        str3 = null;
                        strU = n6b.u(i5, strJ9);
                        if (fv6.j(strU, str2)) {
                            if (str2 == null) {
                                arrayList2 = arrayList5;
                            } else {
                                if (strJ8 != null) {
                                    arrayList2 = arrayList5;
                                } else {
                                    arrayList2 = arrayList5;
                                }
                                xh1Var2 = null;
                            }
                            if (strJ9 == null) {
                                xh1Var = null;
                            } else {
                                i6 = 6;
                                if (strJ9.startsWith("dvhe")) {
                                    i7 = 6;
                                    i8 = -1;
                                    i9 = 1;
                                } else {
                                    i7 = 6;
                                    i8 = -1;
                                    i9 = 1;
                                }
                                if (i6 == i8) {
                                    xh1Var = null;
                                } else {
                                    xh1Var = new xh1(i6, i9, i7, -1, -1, null);
                                }
                            }
                            if (str2 == null) {
                                str2 = strU;
                            }
                            strArrX = n6b.X(strJ9);
                            if (strArrX.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrX.length;
                                i10 = 0;
                                while (i10 < length) {
                                    str4 = strArrX[i10];
                                    String[] strArr2 = strArrX;
                                    if (2 == fv6.h(fv6.d(str4))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str4);
                                    }
                                    i10++;
                                    strArrX = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strJ9 = cj2.a(str2, ",", string);
                            } else {
                                strJ9 = str2;
                            }
                            xh1Var2 = xh1Var;
                        } else {
                            arrayList2 = arrayList5;
                            xh1Var2 = null;
                        }
                        strJ = j(strB, m, null, map3, cVar);
                        if (strJ != null) {
                            String[] strArrSplit4 = strJ.split("x", -1);
                            i12 = Integer.parseInt(strArrSplit4[0]);
                            i11 = Integer.parseInt(strArrSplit4[1]);
                            if (i12 > 0) {
                                i11 = -1;
                                i12 = -1;
                            } else {
                                i11 = -1;
                                i12 = -1;
                            }
                        } else {
                            i11 = -1;
                            i12 = -1;
                        }
                        strJ2 = j(strB, n, null, map3, cVar);
                        if (strJ2 != null) {
                            f2 = Float.parseFloat(strJ2);
                        } else {
                            f2 = -1.0f;
                        }
                        String strJ17 = j(strB, o, null, map3, cVar);
                        String strJ18 = j(strB, d, null, map3, cVar);
                        String strJ19 = j(strB, e, null, map3, cVar);
                        String strJ110 = j(strB, f, null, map3, cVar);
                        String strJ111 = j(strB, g, null, map3, cVar);
                        String strJ112 = j(strB, p, null, map3, cVar);
                        if (zStartsWith) {
                            uriD = a5b.d(string2, k(strB, pattern, map3, cVar));
                        } else {
                            if (bVar.a()) {
                                throw ut7.b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriD = a5b.d(string2, l(bVar.b(), map3, cVar));
                        }
                        uri2 = uriD;
                        id4.a aVar3 = new id4.a();
                        aVar3.a = Integer.toString(arrayList2.size());
                        aVar3.m = fv6.n("application/x-mpegURL");
                        aVar3.j = strJ9;
                        aVar3.h = i4;
                        aVar3.i = i21;
                        aVar3.u = i12;
                        aVar3.v = i11;
                        aVar3.y = f2;
                        aVar3.f = i20;
                        aVar3.D = xh1Var2;
                        arrayList3 = arrayList2;
                        arrayList3.add(new fz4.b(uri2, new id4(aVar3), strJ18, strJ19, strJ110, strJ111, strJ17, strJ112));
                        map = map2;
                        arrayList4 = (ArrayList) map.get(uri2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri2, arrayList4);
                        }
                        arrayList4.add(new qz4.a(strJ18, strJ19, strJ110, strJ111, i4, i21));
                    }
                    z2 = zContains;
                    z3 = z4;
                }
                HashMap map5 = map;
                arrayList5 = arrayList3;
                map2 = map5;
                arrayList9 = arrayList13;
                arrayList8 = arrayList30;
                arrayList12 = arrayList31;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList10 = arrayList10;
            }
            ArrayList arrayList33 = arrayList5;
            map = map2;
            arrayList3 = arrayList33;
            arrayList11 = arrayList11;
            z2 = zContains;
            z3 = z4;
            HashMap map6 = map;
            arrayList5 = arrayList3;
            map2 = map6;
            arrayList9 = arrayList13;
            arrayList8 = arrayList30;
            arrayList12 = arrayList31;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList10 = arrayList10;
        }
    }

    public static boolean g(c cVar, String str, Pattern pattern) {
        Matcher matcherA = c.a(cVar, str, pattern);
        if (matcherA.find()) {
            return "YES".equals(matcherA.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2, c cVar) {
        Matcher matcherA = c.a(cVar, str, pattern);
        if (!matcherA.find()) {
            return d2;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(c cVar, String str, Pattern pattern) {
        Matcher matcherA = c.a(cVar, str, pattern);
        if (!matcherA.find()) {
            return -1L;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map<String, String> map, c cVar) {
        Matcher matcherA = c.a(cVar, str, pattern);
        if (matcherA.find()) {
            str2 = matcherA.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map, cVar);
    }

    public static String k(String str, Pattern pattern, Map<String, String> map, c cVar) throws ut7 {
        String strJ = j(str, pattern, null, map, cVar);
        if (strJ != null) {
            return strJ;
        }
        throw ut7.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map<String, String> map, c cVar) {
        Matcher matcherA = c.a(cVar, str, B0);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherA.find()) {
            String strGroup = matcherA.group(1);
            if (map.containsKey(strGroup)) {
                matcherA.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcherA.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void m(String str, HashMap map) throws ut7 {
        if (map.containsKey(str)) {
            throw ut7.b("duplicate variable name \"" + str + "\"");
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:44:0x009f, B:46:0x00a7, B:48:0x00af, B:50:0x00b7, B:52:0x00bf, B:54:0x00c7, B:56:0x00cf, B:58:0x00d7, B:61:0x00e0, B:62:0x00e4, B:70:0x0106, B:71:0x010c, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:85:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x009d, LOOP:2: B:17:0x0046->B:22:0x0052, LOOP_END, TryCatch #3 {all -> 0x009d, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:44:0x009f, B:46:0x00a7, B:48:0x00af, B:50:0x00b7, B:52:0x00bf, B:54:0x00c7, B:56:0x00cf, B:58:0x00d7, B:61:0x00e0, B:62:0x00e4, B:70:0x0106, B:71:0x010c, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:85:0x0019 }] */
    @Override // vt7.a
    public final Object a(Uri uri, mf2 mf2Var) throws ut7 {
        int i2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(mf2Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        c cVar = new c(16, 0.75f, true);
        try {
            int i3 = bufferedReader.read();
            boolean zL = false;
            if (i3 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i3 = bufferedReader.read();
                    while (i3 != -1) {
                        i3 = bufferedReader.read();
                    }
                    i2 = 0;
                    while (true) {
                        if (i2 < 7) {
                            while (i3 != -1) {
                                i3 = bufferedReader.read();
                            }
                            zL = n6b.L(i3);
                            break;
                        }
                        if (i3 != "#EXTM3U".charAt(i2)) {
                            break;
                            break;
                        }
                        i3 = bufferedReader.read();
                        i2++;
                    }
                }
            } else {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                        while (i3 != -1 && Character.isWhitespace(i3) && !n6b.L(i3)) {
                            i3 = bufferedReader.read();
                        }
                        zL = n6b.L(i3);
                        break;
                    }
                    if (i3 != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            }
            if (!zL) {
                throw ut7.b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String str = n6b.a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    throw ut7.b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        fz4 fz4VarF = f(new b(arrayDeque, bufferedReader), uri, cVar);
                        String str2 = n6b.a;
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                        return fz4VarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    dz4 dz4VarE = e(this.a, this.b, new b(arrayDeque, bufferedReader), uri, cVar);
                    String str3 = n6b.a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                    return dz4VarE;
                }
            }
        } catch (Throwable th) {
            String str4 = n6b.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
