package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qzc extends fyc {
    public long d;
    public long e;

    public static final void A(StringBuilder sb, String str, glc glcVar) {
        if (glcVar == null) {
            return;
        }
        v(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (glcVar.A() != 0) {
            v(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : glcVar.z()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (glcVar.y() != 0) {
            v(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : glcVar.x()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (glcVar.C() != 0) {
            v(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (pjc pjcVar : glcVar.B()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(pjcVar.x() ? Integer.valueOf(pjcVar.y()) : null);
                sb.append(":");
                sb.append(pjcVar.z() ? Long.valueOf(pjcVar.A()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (glcVar.E() != 0) {
            v(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (klc klcVar : glcVar.D()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(klcVar.x() ? Integer.valueOf(klcVar.y()) : null);
                sb.append(": [");
                Iterator it = klcVar.z().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        v(3, sb);
        sb.append("}\n");
    }

    public static final void B(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        v(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void C(StringBuilder sb, int i, String str, jfc jfcVar) {
        String str2;
        if (jfcVar == null) {
            return;
        }
        v(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (jfcVar.x()) {
            int iH = jfcVar.H();
            if (iH == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iH == 2) {
                str2 = "LESS_THAN";
            } else if (iH != 3) {
                str2 = iH != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            B(sb, i, "comparison_type", str2);
        }
        if (jfcVar.y()) {
            B(sb, i, "match_as_float", Boolean.valueOf(jfcVar.z()));
        }
        if (jfcVar.A()) {
            B(sb, i, "comparison_value", jfcVar.B());
        }
        if (jfcVar.C()) {
            B(sb, i, "min_comparison_value", jfcVar.D());
        }
        if (jfcVar.E()) {
            B(sb, i, "max_comparison_value", jfcVar.F());
        }
        v(i, sb);
        sb.append("}\n");
    }

    public static boolean K(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean L(h2c h2cVar, int i) {
        if (i < ((r2c) h2cVar).v * 64) {
            return ((1 << (i % 64)) & ((Long) ((r2c) h2cVar).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static p1c R(p1c p1cVar, byte[] bArr) throws k2c {
        f1c f1cVarA = f1c.a();
        if (f1cVarA != null) {
            p1cVar.getClass();
            p1cVar.m(bArr, bArr.length, f1cVarA);
            return p1cVar;
        }
        p1cVar.getClass();
        int length = bArr.length;
        int i = h0c.a;
        p1cVar.m(bArr, length, f1c.c);
        return p1cVar;
    }

    public static int S(String str, ukc ukcVar) {
        for (int i = 0; i < ((wkc) ukcVar.u).e2(); i++) {
            if (str.equals(((wkc) ukcVar.u).f2(i).z())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] T(i2c i2cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = i2cVar.iterator();
        while (it.hasNext()) {
            akc akcVar = (akc) it.next();
            if (akcVar != null) {
                Bundle bundle = new Bundle();
                for (akc akcVar2 : akcVar.H()) {
                    if (akcVar2.z()) {
                        bundle.putString(akcVar2.y(), akcVar2.A());
                    } else if (akcVar2.B()) {
                        bundle.putLong(akcVar2.y(), akcVar2.C());
                    } else if (akcVar2.F()) {
                        bundle.putDouble(akcVar2.y(), akcVar2.G());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap U(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(U((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(U((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(U((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static z9c k(zxb zxbVar) {
        Object obj;
        Bundle bundleL = l(zxbVar.c, true);
        String string = (!bundleL.containsKey("_o") || (obj = bundleL.get("_o")) == null) ? "app" : obj.toString();
        String strE = s7.e(zxbVar.a, oh7.a, oh7.f);
        if (strE == null) {
            strE = zxbVar.a;
        }
        return new z9c(strE, new v9c(bundleL), string, zxbVar.b, 0L);
    }

    public static Bundle l(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(l((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void o(rjc rjcVar, String str, Long l) {
        List listN = rjcVar.n();
        int i = 0;
        while (true) {
            if (i >= listN.size()) {
                i = -1;
                break;
            } else if (str.equals(((akc) listN.get(i)).y())) {
                break;
            } else {
                i++;
            }
        }
        yjc yjcVarJ = akc.J();
        yjcVarJ.n(str);
        yjcVarJ.p(l.longValue());
        if (i < 0) {
            rjcVar.r(yjcVarJ);
        } else {
            rjcVar.h();
            ((tjc) rjcVar.u).O(i, (akc) yjcVarJ.j());
        }
    }

    public static final Bundle p(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            akc akcVar = (akc) it.next();
            String strY = akcVar.y();
            if (akcVar.F()) {
                bundle.putDouble(strY, akcVar.G());
            } else if (akcVar.D()) {
                bundle.putFloat(strY, akcVar.E());
            } else if (akcVar.z()) {
                bundle.putString(strY, akcVar.A());
            } else if (akcVar.B()) {
                bundle.putLong(strY, akcVar.C());
            }
        }
        return bundle;
    }

    public static final akc q(String str, tjc tjcVar) {
        for (akc akcVar : tjcVar.z()) {
            if (akcVar.y().equals(str)) {
                return akcVar;
            }
        }
        return null;
    }

    public static final String r(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable s(String str, tjc tjcVar) {
        akc akcVarQ = q(str, tjcVar);
        if (akcVarQ == null) {
            return null;
        }
        return y(akcVarQ);
    }

    public static final void v(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void w(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String x(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable y(akc akcVar) {
        if (akcVar.z()) {
            return akcVar.A();
        }
        if (akcVar.B()) {
            return Long.valueOf(akcVar.C());
        }
        if (akcVar.F()) {
            return Double.valueOf(akcVar.G());
        }
        if (akcVar.I() > 0) {
            return T(akcVar.H());
        }
        return null;
    }

    public static final void z(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                w(builder, str3, string, hashSet);
            }
        }
    }

    public final void D(zlc zlcVar, Object obj) {
        a78.g(obj);
        zlcVar.h();
        ((bmc) zlcVar.u).M();
        zlcVar.h();
        ((bmc) zlcVar.u).O();
        zlcVar.h();
        ((bmc) zlcVar.u).Q();
        if (obj instanceof String) {
            zlcVar.h();
            ((bmc) zlcVar.u).L((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            zlcVar.h();
            ((bmc) zlcVar.u).N(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            zlcVar.h();
            ((bmc) zlcVar.u).P(dDoubleValue);
        } else {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void E(yjc yjcVar, Object obj) {
        yjcVar.h();
        ((akc) yjcVar.u).M();
        yjcVar.h();
        ((akc) yjcVar.u).O();
        yjcVar.h();
        ((akc) yjcVar.u).Q();
        yjcVar.h();
        ((akc) yjcVar.u).T();
        if (obj instanceof String) {
            yjcVar.o((String) obj);
            return;
        }
        if (obj instanceof Long) {
            yjcVar.p(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            yjcVar.h();
            ((akc) yjcVar.u).P(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                yjc yjcVarJ = akc.J();
                for (String str : bundle.keySet()) {
                    yjc yjcVarJ2 = akc.J();
                    yjcVarJ2.n(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        yjcVarJ2.p(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        yjcVarJ2.o((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        yjcVarJ2.h();
                        ((akc) yjcVarJ2.u).P(dDoubleValue2);
                    }
                    yjcVarJ.h();
                    ((akc) yjcVarJ.u).R((akc) yjcVarJ2.j());
                }
                if (((akc) yjcVarJ.u).I() > 0) {
                    arrayList.add((akc) yjcVarJ.j());
                }
            }
        }
        yjcVar.h();
        ((akc) yjcVar.u).S(arrayList);
    }

    public final kxc F(String str, ukc ukcVar, rjc rjcVar, String str2) {
        int iIndexOf;
        o6c.a();
        tkc tkcVar = this.a;
        t7c t7cVar = tkcVar.d;
        if (!t7cVar.r(str, wfc.O0)) {
            return null;
        }
        tkcVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(t7cVar.n(str, wfc.t0).split(",")));
        lzc lzcVar = this.b;
        jyc jycVar = lzcVar.j;
        ujc ujcVar = lzcVar.a;
        ujc ujcVar2 = jycVar.b.a;
        lzc.U(ujcVar2);
        String strT = ujcVar2.t(str);
        Uri.Builder builder = new Uri.Builder();
        t7c t7cVar2 = jycVar.a.d;
        builder.scheme(t7cVar2.n(str, wfc.m0));
        if (TextUtils.isEmpty(strT)) {
            builder.authority(t7cVar2.n(str, wfc.n0));
        } else {
            String strN = t7cVar2.n(str, wfc.n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(strN).length());
            sb.append(strT);
            sb.append(".");
            sb.append(strN);
            builder.authority(sb.toString());
        }
        builder.path(t7cVar2.n(str, wfc.o0));
        w(builder, "gmp_app_id", ((wkc) ukcVar.u).M(), hashSet);
        t7cVar.m();
        w(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strG = ((wkc) ukcVar.u).G();
        ufc ufcVar = wfc.R0;
        if (t7cVar.r(str, ufcVar)) {
            lzc.U(ujcVar);
            if (ujcVar.A(str)) {
                strG = BuildConfig.FLAVOR;
            }
        }
        w(builder, "app_instance_id", strG, hashSet);
        w(builder, "rdid", ((wkc) ukcVar.u).D(), hashSet);
        w(builder, "bundle_id", ukcVar.u(), hashSet);
        String strT2 = rjcVar.t();
        String strE = s7.e(strT2, oh7.f, oh7.a);
        if (true != TextUtils.isEmpty(strE)) {
            strT2 = strE;
        }
        w(builder, "app_event_name", strT2, hashSet);
        w(builder, "app_version", String.valueOf(((wkc) ukcVar.u).S()), hashSet);
        String strR2 = ((wkc) ukcVar.u).r2();
        if (t7cVar.r(str, ufcVar)) {
            lzc.U(ujcVar);
            if (ujcVar.z(str) && !TextUtils.isEmpty(strR2) && (iIndexOf = strR2.indexOf(".")) != -1) {
                strR2 = strR2.substring(0, iIndexOf);
            }
        }
        w(builder, "os_version", strR2, hashSet);
        w(builder, "timestamp", String.valueOf(rjcVar.v()), hashSet);
        if (((wkc) ukcVar.u).F()) {
            w(builder, "lat", "1", hashSet);
        }
        w(builder, "privacy_sandbox_version", String.valueOf(((wkc) ukcVar.u).O0()), hashSet);
        w(builder, "trigger_uri_source", "1", hashSet);
        w(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        w(builder, "request_uuid", str2, hashSet);
        List<akc> listN = rjcVar.n();
        Bundle bundle = new Bundle();
        for (akc akcVar : listN) {
            String strY = akcVar.y();
            if (akcVar.F()) {
                bundle.putString(strY, String.valueOf(akcVar.G()));
            } else if (akcVar.D()) {
                bundle.putString(strY, String.valueOf(akcVar.E()));
            } else if (akcVar.z()) {
                bundle.putString(strY, akcVar.A());
            } else if (akcVar.B()) {
                bundle.putString(strY, String.valueOf(akcVar.C()));
            }
        }
        z(builder, t7cVar.n(str, wfc.s0).split("\\|"), bundle, hashSet);
        List<bmc> listUnmodifiableList = Collections.unmodifiableList(((wkc) ukcVar.u).d2());
        Bundle bundle2 = new Bundle();
        for (bmc bmcVar : listUnmodifiableList) {
            String strZ = bmcVar.z();
            if (bmcVar.G()) {
                bundle2.putString(strZ, String.valueOf(bmcVar.H()));
            } else if (bmcVar.E()) {
                bundle2.putString(strZ, String.valueOf(bmcVar.F()));
            } else if (bmcVar.A()) {
                bundle2.putString(strZ, bmcVar.B());
            } else if (bmcVar.C()) {
                bundle2.putString(strZ, String.valueOf(bmcVar.D()));
            }
        }
        z(builder, t7cVar.n(str, wfc.r0).split("\\|"), bundle2, hashSet);
        w(builder, "dma", true != ((wkc) ukcVar.u).L0() ? "0" : "1", hashSet);
        if (!((wkc) ukcVar.u).N0().isEmpty()) {
            w(builder, "dma_cps", ((wkc) ukcVar.u).N0(), hashSet);
        }
        if (((wkc) ukcVar.u).T0()) {
            mic micVarU0 = ((wkc) ukcVar.u).U0();
            if (!micVarU0.L().isEmpty()) {
                w(builder, "dl_gclid", micVarU0.L(), hashSet);
            }
            if (!micVarU0.N().isEmpty()) {
                w(builder, "dl_gbraid", micVarU0.N(), hashSet);
            }
            if (!micVarU0.P().isEmpty()) {
                w(builder, "dl_gs", micVarU0.P(), hashSet);
            }
            if (micVarU0.R() > 0) {
                w(builder, "dl_ss_ts", String.valueOf(micVarU0.R()), hashSet);
            }
            if (!micVarU0.T().isEmpty()) {
                w(builder, "mr_gclid", micVarU0.T(), hashSet);
            }
            if (!micVarU0.V().isEmpty()) {
                w(builder, "mr_gbraid", micVarU0.V(), hashSet);
            }
            if (!micVarU0.X().isEmpty()) {
                w(builder, "mr_gs", micVarU0.X(), hashSet);
            }
            if (micVarU0.Z() > 0) {
                w(builder, "mr_click_ts", String.valueOf(micVarU0.Z()), hashSet);
            }
        }
        return new kxc(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final tjc G(p9c p9cVar) {
        rjc rjcVarN = tjc.N();
        long j = p9cVar.f;
        rjcVarN.h();
        ((tjc) rjcVarN.u).V(j);
        long j2 = p9cVar.e;
        rjcVarN.h();
        ((tjc) rjcVarN.u).x(j2);
        v9c v9cVar = p9cVar.g;
        Objects.requireNonNull(v9cVar);
        Bundle bundle = v9cVar.t;
        for (String str : bundle.keySet()) {
            yjc yjcVarJ = akc.J();
            yjcVarJ.n(str);
            Object obj = bundle.get(str);
            a78.g(obj);
            E(yjcVarJ, obj);
            rjcVarN.r(yjcVarJ);
        }
        String str2 = p9cVar.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            yjc yjcVarJ2 = akc.J();
            yjcVarJ2.n("_o");
            yjcVarJ2.o(str2);
            rjcVarN.q((akc) yjcVarJ2.j());
        }
        return (tjc) rjcVarN.j();
    }

    public final String H(skc skcVar) {
        String str;
        String str2;
        String str3;
        uic uicVarQ0;
        StringBuilder sbA = bl2.a("\nbatch {\n");
        if (skcVar.C()) {
            B(sbA, 0, "upload_subdomain", skcVar.D());
        }
        if (skcVar.A()) {
            B(sbA, 0, "sgtm_join_id", skcVar.B());
        }
        for (wkc wkcVar : skcVar.x()) {
            if (wkcVar != null) {
                v(1, sbA);
                sbA.append("bundle {\n");
                if (wkcVar.X()) {
                    B(sbA, 1, "protocol_version", Integer.valueOf(wkcVar.X0()));
                }
                tkc tkcVar = this.a;
                t7c t7cVar = tkcVar.d;
                fhc fhcVar = tkcVar.j;
                if (t7cVar.r(wkcVar.x(), wfc.M0) && wkcVar.D0()) {
                    B(sbA, 1, "session_stitching_token", wkcVar.E0());
                }
                B(sbA, 1, "platform", wkcVar.q2());
                if (wkcVar.z()) {
                    B(sbA, 1, "gmp_version", Long.valueOf(wkcVar.A()));
                }
                if (wkcVar.B()) {
                    B(sbA, 1, "uploading_gmp_version", Long.valueOf(wkcVar.C()));
                }
                if (wkcVar.z0()) {
                    B(sbA, 1, "dynamite_version", Long.valueOf(wkcVar.A0()));
                }
                if (wkcVar.T()) {
                    B(sbA, 1, "config_version", Long.valueOf(wkcVar.U()));
                }
                B(sbA, 1, "gmp_app_id", wkcVar.M());
                B(sbA, 1, "app_id", wkcVar.x());
                B(sbA, 1, "app_version", wkcVar.y());
                if (wkcVar.R()) {
                    B(sbA, 1, "app_version_major", Integer.valueOf(wkcVar.S()));
                }
                B(sbA, 1, "firebase_instance_id", wkcVar.Q());
                if (wkcVar.H()) {
                    B(sbA, 1, "dev_cert_hash", Long.valueOf(wkcVar.I()));
                }
                B(sbA, 1, "app_store", wkcVar.w2());
                if (wkcVar.g2()) {
                    B(sbA, 1, "upload_timestamp_millis", Long.valueOf(wkcVar.h2()));
                }
                if (wkcVar.i2()) {
                    B(sbA, 1, "start_timestamp_millis", Long.valueOf(wkcVar.j2()));
                }
                if (wkcVar.k2()) {
                    B(sbA, 1, "end_timestamp_millis", Long.valueOf(wkcVar.l2()));
                }
                if (wkcVar.m2()) {
                    B(sbA, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(wkcVar.n2()));
                }
                if (wkcVar.o2()) {
                    B(sbA, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(wkcVar.p2()));
                }
                B(sbA, 1, "app_instance_id", wkcVar.G());
                B(sbA, 1, "resettable_device_id", wkcVar.D());
                B(sbA, 1, "ds_id", wkcVar.W());
                if (wkcVar.E()) {
                    B(sbA, 1, "limited_ad_tracking", Boolean.valueOf(wkcVar.F()));
                }
                B(sbA, 1, "os_version", wkcVar.r2());
                B(sbA, 1, "device_model", wkcVar.s2());
                B(sbA, 1, "user_default_language", wkcVar.t2());
                if (wkcVar.u2()) {
                    B(sbA, 1, "time_zone_offset_minutes", Integer.valueOf(wkcVar.v2()));
                }
                if (wkcVar.J()) {
                    B(sbA, 1, "bundle_sequential_index", Integer.valueOf(wkcVar.K()));
                }
                if (wkcVar.R0()) {
                    B(sbA, 1, "delivery_index", Integer.valueOf(wkcVar.S0()));
                }
                if (wkcVar.N()) {
                    B(sbA, 1, "service_upload", Boolean.valueOf(wkcVar.O()));
                }
                B(sbA, 1, "health_monitor", wkcVar.L());
                if (wkcVar.x0()) {
                    B(sbA, 1, "retry_counter", Integer.valueOf(wkcVar.y0()));
                }
                if (wkcVar.B0()) {
                    B(sbA, 1, "consent_signals", wkcVar.C0());
                }
                if (wkcVar.K0()) {
                    B(sbA, 1, "is_dma_region", Boolean.valueOf(wkcVar.L0()));
                }
                if (wkcVar.M0()) {
                    B(sbA, 1, "core_platform_services", wkcVar.N0());
                }
                if (wkcVar.I0()) {
                    B(sbA, 1, "consent_diagnostics", wkcVar.J0());
                }
                if (wkcVar.F0()) {
                    B(sbA, 1, "target_os_version", Long.valueOf(wkcVar.G0()));
                }
                o6c.a();
                if (t7cVar.r(wkcVar.x(), wfc.O0)) {
                    B(sbA, 1, "ad_services_version", Integer.valueOf(wkcVar.O0()));
                    if (wkcVar.P0() && (uicVarQ0 = wkcVar.Q0()) != null) {
                        v(2, sbA);
                        sbA.append("attribution_eligibility_status {\n");
                        B(sbA, 2, "eligible", Boolean.valueOf(uicVarQ0.x()));
                        B(sbA, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(uicVarQ0.y()));
                        B(sbA, 2, "pre_r", Boolean.valueOf(uicVarQ0.z()));
                        B(sbA, 2, "r_extensions_too_old", Boolean.valueOf(uicVarQ0.A()));
                        B(sbA, 2, "adservices_extension_too_old", Boolean.valueOf(uicVarQ0.B()));
                        B(sbA, 2, "ad_storage_not_allowed", Boolean.valueOf(uicVarQ0.C()));
                        B(sbA, 2, "measurement_manager_disabled", Boolean.valueOf(uicVarQ0.D()));
                        v(2, sbA);
                        sbA.append("}\n");
                    }
                }
                if (wkcVar.T0()) {
                    mic micVarU0 = wkcVar.U0();
                    v(2, sbA);
                    sbA.append("ad_campaign_info {\n");
                    if (micVarU0.K()) {
                        B(sbA, 2, "deep_link_gclid", micVarU0.L());
                    }
                    if (micVarU0.M()) {
                        B(sbA, 2, "deep_link_gbraid", micVarU0.N());
                    }
                    if (micVarU0.O()) {
                        B(sbA, 2, "deep_link_gad_source", micVarU0.P());
                    }
                    if (micVarU0.a0()) {
                        B(sbA, 2, "deep_link_url", micVarU0.b0());
                    }
                    if (micVarU0.Q()) {
                        B(sbA, 2, "deep_link_session_millis", Long.valueOf(micVarU0.R()));
                    }
                    if (micVarU0.S()) {
                        B(sbA, 2, "market_referrer_gclid", micVarU0.T());
                    }
                    if (micVarU0.U()) {
                        B(sbA, 2, "market_referrer_gbraid", micVarU0.V());
                    }
                    if (micVarU0.W()) {
                        B(sbA, 2, "market_referrer_gad_source", micVarU0.X());
                    }
                    if (micVarU0.Y()) {
                        B(sbA, 2, "market_referrer_click_millis", Long.valueOf(micVarU0.Z()));
                    }
                    v(2, sbA);
                    sbA.append("}\n");
                }
                if (wkcVar.Y()) {
                    B(sbA, 1, "batching_timestamp_millis", Long.valueOf(wkcVar.Z()));
                }
                if (wkcVar.V0()) {
                    xlc xlcVarW0 = wkcVar.W0();
                    v(2, sbA);
                    sbA.append("sgtm_diagnostics {\n");
                    int iB = xlcVarW0.B();
                    if (iB == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iB == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iB != 3) {
                        str2 = iB != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    B(sbA, 2, "upload_type", str2);
                    B(sbA, 2, "client_upload_eligibility", pk.e(xlcVarW0.x()));
                    int iC = xlcVarW0.C();
                    if (iC == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iC == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iC == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iC != 4) {
                        str3 = iC != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    B(sbA, 2, "service_upload_eligibility", str3);
                    v(2, sbA);
                    sbA.append("}\n");
                }
                if (wkcVar.a0()) {
                    ljc ljcVarB0 = wkcVar.b0();
                    v(2, sbA);
                    sbA.append("consent_info_extra {\n");
                    for (gjc gjcVar : ljcVarB0.x()) {
                        v(3, sbA);
                        sbA.append("limited_data_modes {\n");
                        int iY = gjcVar.y();
                        if (iY == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iY == 2) {
                            str = "AD_STORAGE";
                        } else if (iY != 3) {
                            str = iY != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        B(sbA, 3, "type", str);
                        int iZ = gjcVar.z();
                        B(sbA, 3, "mode", iZ != 1 ? iZ != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        v(3, sbA);
                        sbA.append("}\n");
                    }
                    v(2, sbA);
                    sbA.append("}\n");
                }
                i2c<bmc> i2cVarD2 = wkcVar.d2();
                if (i2cVarD2 != null) {
                    for (bmc bmcVar : i2cVarD2) {
                        if (bmcVar != null) {
                            v(2, sbA);
                            sbA.append("user_property {\n");
                            B(sbA, 2, "set_timestamp_millis", bmcVar.x() ? Long.valueOf(bmcVar.y()) : null);
                            B(sbA, 2, "name", fhcVar.c(bmcVar.z()));
                            B(sbA, 2, "string_value", bmcVar.B());
                            B(sbA, 2, "int_value", bmcVar.C() ? Long.valueOf(bmcVar.D()) : null);
                            B(sbA, 2, "double_value", bmcVar.G() ? Double.valueOf(bmcVar.H()) : null);
                            v(2, sbA);
                            sbA.append("}\n");
                        }
                    }
                }
                i2c<yic> i2cVarP = wkcVar.P();
                if (i2cVarP != null) {
                    for (yic yicVar : i2cVarP) {
                        if (yicVar != null) {
                            v(2, sbA);
                            sbA.append("audience_membership {\n");
                            if (yicVar.x()) {
                                B(sbA, 2, "audience_id", Integer.valueOf(yicVar.y()));
                            }
                            if (yicVar.C()) {
                                B(sbA, 2, "new_audience", Boolean.valueOf(yicVar.D()));
                            }
                            A(sbA, "current_data", yicVar.z());
                            if (yicVar.A()) {
                                A(sbA, "previous_data", yicVar.B());
                            }
                            v(2, sbA);
                            sbA.append("}\n");
                        }
                    }
                }
                List<tjc> listX1 = wkcVar.X1();
                if (listX1 != null) {
                    for (tjc tjcVar : listX1) {
                        if (tjcVar != null) {
                            v(2, sbA);
                            sbA.append("event {\n");
                            B(sbA, 2, "name", fhcVar.a(tjcVar.C()));
                            if (tjcVar.D()) {
                                B(sbA, 2, "timestamp_millis", Long.valueOf(tjcVar.E()));
                            }
                            if (t7cVar.r(null, wfc.e1) && tjcVar.J()) {
                                B(sbA, 2, "corrected_timestamp_millis", Long.valueOf(tjcVar.K()));
                            }
                            if (tjcVar.F()) {
                                B(sbA, 2, "previous_timestamp_millis", Long.valueOf(tjcVar.G()));
                            }
                            if (tjcVar.H()) {
                                B(sbA, 2, "count", Integer.valueOf(tjcVar.I()));
                            }
                            if (tjcVar.A() != 0) {
                                t(sbA, 2, (i2c) tjcVar.z());
                            }
                            v(2, sbA);
                            sbA.append("}\n");
                        }
                    }
                }
                v(1, sbA);
                sbA.append("}\n");
            }
        }
        sbA.append("} // End-of-batch\n");
        return sbA.toString();
    }

    public final String I(lfc lfcVar) {
        StringBuilder sbA = bl2.a("\nproperty_filter {\n");
        if (lfcVar.x()) {
            B(sbA, 0, "filter_id", Integer.valueOf(lfcVar.y()));
        }
        B(sbA, 0, "property_name", this.a.j.c(lfcVar.z()));
        String strX = x(lfcVar.B(), lfcVar.C(), lfcVar.E());
        if (!strX.isEmpty()) {
            B(sbA, 0, "filter_type", strX);
        }
        u(sbA, 1, lfcVar.A());
        sbA.append("}\n");
        return sbA.toString();
    }

    public final Parcelable J(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (sz8.a unused) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List N(h2c h2cVar, List list) {
        int i;
        ArrayList arrayList = new ArrayList(h2cVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            tkc tkcVar = this.a;
            if (iIntValue < 0) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.i.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean O(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        this.a.k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long P(byte[] bArr) {
        a78.g(bArr);
        tkc tkcVar = this.a;
        yzc yzcVar = tkcVar.i;
        tkc.k(yzcVar);
        yzcVar.g();
        MessageDigest messageDigestZ = yzc.z();
        if (messageDigestZ != null) {
            return yzc.A(messageDigestZ.digest(bArr));
        }
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.f.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] Q(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.b(e, "Failed to gzip content");
            throw e;
        }
    }

    public final void m(Map map) {
        long epochMilli;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String strR = r("Date", map);
            if (TextUtils.isEmpty(strR)) {
                return;
            }
            tkc tkcVar = this.a;
            if (i >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strR, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.i.b(strR, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                tkcVar.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                g();
                if (this.e == 0) {
                    this.d = jElapsedRealtime;
                    this.e = epochMilli;
                }
            }
        }
    }

    public final long n(long j) {
        g();
        long j2 = this.e;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.d) + j;
    }

    public final void t(StringBuilder sb, int i, i2c i2cVar) {
        if (i2cVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator<E> it = i2cVar.iterator();
        while (it.hasNext()) {
            akc akcVar = (akc) it.next();
            if (akcVar != null) {
                v(i2, sb);
                sb.append("param {\n");
                B(sb, i2, "name", akcVar.x() ? this.a.j.b(akcVar.y()) : null);
                B(sb, i2, "string_value", akcVar.z() ? akcVar.A() : null);
                B(sb, i2, "int_value", akcVar.B() ? Long.valueOf(akcVar.C()) : null);
                B(sb, i2, "double_value", akcVar.F() ? Double.valueOf(akcVar.G()) : null);
                if (akcVar.I() > 0) {
                    t(sb, i2, akcVar.H());
                }
                v(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void u(StringBuilder sb, int i, gfc gfcVar) {
        String str;
        if (gfcVar == null) {
            return;
        }
        v(i, sb);
        sb.append("filter {\n");
        if (gfcVar.B()) {
            B(sb, i, "complement", Boolean.valueOf(gfcVar.C()));
        }
        if (gfcVar.D()) {
            B(sb, i, "param_name", this.a.j.b(gfcVar.E()));
        }
        if (gfcVar.x()) {
            int i2 = i + 1;
            ofc ofcVarY = gfcVar.y();
            if (ofcVarY != null) {
                v(i2, sb);
                sb.append("string_filter {\n");
                if (ofcVarY.x()) {
                    switch (ofcVarY.F()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    B(sb, i2, "match_type", str);
                }
                if (ofcVarY.y()) {
                    B(sb, i2, "expression", ofcVarY.z());
                }
                if (ofcVarY.A()) {
                    B(sb, i2, "case_sensitive", Boolean.valueOf(ofcVarY.B()));
                }
                if (ofcVarY.D() > 0) {
                    v(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : ofcVarY.C()) {
                        v(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                v(i2, sb);
                sb.append("}\n");
            }
        }
        if (gfcVar.z()) {
            C(sb, i + 1, "number_filter", gfcVar.A());
        }
        v(i, sb);
        sb.append("}\n");
    }

    @Override // defpackage.fyc
    public final void j() {
    }
}
