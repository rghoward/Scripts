package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wgc extends dgc {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public final long i;
    public final long j;
    public List k;
    public String l;
    public final String m;
    public int n;
    public String o;
    public String p;
    public long q;
    public String r;

    public wgc(tkc tkcVar, long j, long j2, String str) {
        super(tkcVar);
        this.q = 0L;
        this.r = null;
        this.i = j;
        this.j = j2;
        this.m = str;
    }

    @Override // defpackage.dgc
    public final boolean j() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0266 A[Catch: NameNotFoundException -> 0x026e, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x026e, blocks: (B:98:0x0260, B:100:0x0266), top: B:135:0x0260 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0269 A[PHI: r5 r37
      0x0269: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x026e, B:99:0x0264] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x026e, B:99:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x02be  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:122:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x019f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:87:0x0229  */
    /* JADX WARN: Code duplicated, block: B:91:0x0236  */
    /* JADX WARN: Code duplicated, block: B:92:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x0251  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final q1d k(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zD;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jA;
        long jMin;
        Boolean boolT;
        boolean z4;
        boolean z5;
        boolean z6;
        String str4;
        Boolean boolT2;
        boolean zBooleanValue;
        tkc tkcVar;
        String strM;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoA;
        ufc ufcVar;
        int iD;
        long jE;
        g();
        String strM2 = m();
        String strN = n();
        h();
        String str5 = this.d;
        h();
        long j4 = this.e;
        h();
        a78.g(this.f);
        String str6 = this.f;
        tkc tkcVar2 = this.a;
        t7c t7cVar = tkcVar2.d;
        thc thcVar = tkcVar2.f;
        t7c t7cVar2 = tkcVar2.d;
        Context context = tkcVar2.a;
        yzc yzcVar = tkcVar2.i;
        zic zicVar = tkcVar2.e;
        t7cVar.m();
        h();
        g();
        long j5 = this.h;
        if (j5 == 0) {
            tkc.k(yzcVar);
            tkc tkcVar3 = yzcVar.a;
            String packageName = context.getPackageName();
            yzcVar.g();
            a78.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestZ = yzc.z();
            long jA2 = -1;
            if (messageDigestZ == null) {
                thc thcVar2 = tkcVar3.f;
                tkc.m(thcVar2);
                thcVar2.f.a("Could not get MD5 instance");
                str2 = str5;
                j = j4;
            } else {
                if (packageManager != null) {
                    try {
                        if (yzcVar.P(context, packageName)) {
                            str2 = str5;
                            j = j4;
                            jA2 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j4;
                                try {
                                    Signature[] signatureArr = wqb.a(context).b(64, tkcVar3.a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        thc thcVar3 = tkcVar3.f;
                                        tkc.m(thcVar3);
                                        thcVar3.i.a("Could not get signatures");
                                    } else {
                                        jA2 = yzc.A(messageDigestZ.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    thc thcVar4 = tkcVar3.f;
                                    tkc.m(thcVar4);
                                    thcVar4.f.b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j4;
                                thc thcVar5 = tkcVar3.f;
                                tkc.m(thcVar5);
                                thcVar5.f.b(e, "Package name not found");
                                j2 = 0;
                                this.h = j2;
                                zD = tkcVar2.d();
                                tkc.k(zicVar);
                                z2 = !zicVar.r;
                                g();
                                if (tkcVar2.d()) {
                                    if (t7cVar2.r(null, wfc.H0)) {
                                        tkc.m(thcVar);
                                        thcVar.n.a("Disabled IID for tests.");
                                        z3 = zD;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zD;
                                            } else {
                                                z3 = zD;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            tkc.m(thcVar);
                                                            thcVar.k.a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    tkc.m(thcVar);
                                                    thcVar.j.a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zD;
                                    str3 = null;
                                }
                                tkc.k(zicVar);
                                jA = zicVar.f.a();
                                long j6 = j2;
                                jMin = tkcVar2.D;
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                h();
                                int i3 = this.n;
                                boolT = t7cVar2.t("google_analytics_adid_collection_enabled");
                                if (boolT != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                tkc.k(zicVar);
                                zicVar.g();
                                long j7 = jMin;
                                boolean z8 = zicVar.k().getBoolean("deferred_analytics_collection", z);
                                if (t7cVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != hnc.GRANTED) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.k;
                                String strG = zicVar.n().g();
                                if (this.l == null) {
                                    tkc.k(yzcVar);
                                    this.l = yzcVar.e0();
                                }
                                String str7 = this.l;
                                if (zicVar.n().i(lnc.ANALYTICS_STORAGE)) {
                                    g();
                                    if (this.q == 0) {
                                        z6 = z2;
                                    } else {
                                        tkcVar2.k.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.q;
                                        z6 = z2;
                                        if (this.p != null) {
                                            l();
                                        }
                                    }
                                    if (this.p == null) {
                                        l();
                                    }
                                    str4 = this.p;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolT2 = t7cVar2.t("google_analytics_sgtm_upload_enabled");
                                if (boolT2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolT2.booleanValue();
                                }
                                tkc.k(yzcVar);
                                tkcVar = yzcVar.a;
                                String str8 = str4;
                                strM = m();
                                boolean z9 = zBooleanValue;
                                if (tkcVar.a.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfoA = wqb.a(tkcVar.a).a(0, strM);
                                            if (applicationInfoA != null) {
                                                i2 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            thc thcVar6 = tkcVar.f;
                                            tkc.m(thcVar6);
                                            thcVar6.l.b(strM, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                tkc.k(zicVar);
                                int i4 = zicVar.n().b;
                                tkc.k(zicVar);
                                zicVar.g();
                                String str9 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).b;
                                o6c.a();
                                ufcVar = wfc.P0;
                                if (t7cVar2.r(null, ufcVar)) {
                                    tkc.k(yzcVar);
                                    iD = yzc.D();
                                } else {
                                    iD = 0;
                                }
                                o6c.a();
                                if (t7cVar2.r(null, ufcVar)) {
                                    tkc.k(yzcVar);
                                    jE = yzcVar.E();
                                } else {
                                    jE = 0;
                                }
                                String str10 = t7cVar2.c;
                                String strValueOf = String.valueOf(nnc.h(t7cVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j8 = j3;
                                long j9 = tkcVar2.D;
                                tkc.j(tkcVar2.u);
                                return new q1d(strM2, strN, str2, j, str6, 161000L, j6, str, z3, z6, str3, j7, i3, z7, z8, boolValueOf, this.i, list, strG, str7, str8, z9, j8, i4, str9, iD, jE, str10, strValueOf, j9, pk.b(tkcVar2.u.l()), t7cVar2.r(null, wfc.e1) ? tkcVar2.E : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j4;
                }
                j2 = 0;
                this.h = j2;
            }
            j2 = jA2;
            this.h = j2;
        } else {
            str2 = str5;
            j = j4;
            z = false;
            j2 = j5;
        }
        zD = tkcVar2.d();
        tkc.k(zicVar);
        z2 = !zicVar.r;
        g();
        if (tkcVar2.d()) {
            z3 = zD;
            str3 = null;
        } else {
            if (t7cVar2.r(null, wfc.H0)) {
                tkc.m(thcVar);
                thcVar.n.a("Disabled IID for tests.");
                z3 = zD;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zD;
                } else {
                    z3 = zD;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        tkc.k(zicVar);
        jA = zicVar.f.a();
        long j10 = j2;
        jMin = tkcVar2.D;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        h();
        int i5 = this.n;
        boolT = t7cVar2.t("google_analytics_adid_collection_enabled");
        if (boolT != null || boolT.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        tkc.k(zicVar);
        zicVar.g();
        long j11 = jMin;
        boolean z10 = zicVar.k().getBoolean("deferred_analytics_collection", z);
        if (t7cVar2.w("google_analytics_default_allow_ad_personalization_signals", true) != hnc.GRANTED) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.k;
        String strG2 = zicVar.n().g();
        if (this.l == null) {
            tkc.k(yzcVar);
            this.l = yzcVar.e0();
        }
        String str11 = this.l;
        if (zicVar.n().i(lnc.ANALYTICS_STORAGE)) {
            z6 = z2;
            str4 = null;
        } else {
            g();
            if (this.q == 0) {
                z6 = z2;
            } else {
                tkcVar2.k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.q;
                z6 = z2;
                if (this.p != null && jCurrentTimeMillis2 > 86400000 && this.r == null) {
                    l();
                }
            }
            if (this.p == null) {
                l();
            }
            str4 = this.p;
        }
        boolT2 = t7cVar2.t("google_analytics_sgtm_upload_enabled");
        if (boolT2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolT2.booleanValue();
        }
        tkc.k(yzcVar);
        tkcVar = yzcVar.a;
        String str12 = str4;
        strM = m();
        boolean z11 = zBooleanValue;
        if (tkcVar.a.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfoA = wqb.a(tkcVar.a).a(0, strM);
            if (applicationInfoA != null) {
                i2 = applicationInfoA.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        tkc.k(zicVar);
        int i6 = zicVar.n().b;
        tkc.k(zicVar);
        zicVar.g();
        String str13 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).b;
        o6c.a();
        ufcVar = wfc.P0;
        if (t7cVar2.r(null, ufcVar)) {
            tkc.k(yzcVar);
            iD = yzc.D();
        } else {
            iD = 0;
        }
        o6c.a();
        if (t7cVar2.r(null, ufcVar)) {
            tkc.k(yzcVar);
            jE = yzcVar.E();
        } else {
            jE = 0;
        }
        String str14 = t7cVar2.c;
        String strValueOf2 = String.valueOf(nnc.h(t7cVar2.w("google_analytics_default_allow_ad_personalization_signals", true)));
        long j12 = j3;
        long j13 = tkcVar2.D;
        tkc.j(tkcVar2.u);
        return new q1d(strM2, strN, str2, j, str6, 161000L, j10, str, z3, z6, str3, j11, i5, z7, z10, boolValueOf2, this.i, list2, strG2, str11, str12, z11, j12, i6, str13, iD, jE, str14, strValueOf2, j13, pk.b(tkcVar2.u.l()), t7cVar2.r(null, wfc.e1) ? tkcVar2.E : 0L);
    }

    public final void l() {
        String str;
        g();
        tkc tkcVar = this.a;
        zic zicVar = tkcVar.e;
        thc thcVar = tkcVar.f;
        tkc.k(zicVar);
        if (zicVar.n().i(lnc.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            yzc yzcVar = tkcVar.i;
            tkc.k(yzcVar);
            yzcVar.g0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            tkc.m(thcVar);
            thcVar.m.a("Analytics Storage consent is not granted");
            str = null;
        }
        tkc.m(thcVar);
        thcVar.m.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.p = str;
        tkcVar.k.getClass();
        this.q = System.currentTimeMillis();
    }

    public final String m() {
        h();
        a78.g(this.c);
        return this.c;
    }

    public final String n() {
        g();
        h();
        a78.g(this.o);
        return this.o;
    }
}
