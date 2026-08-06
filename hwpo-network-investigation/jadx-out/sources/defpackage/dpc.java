package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.intercom.twig.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dpc extends v8c {
    public final /* synthetic */ hrc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpc(hrc hrcVar, enc encVar) {
        super(encVar);
        this.e = hrcVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0272 A[Catch: IllegalArgumentException -> 0x0279, MalformedURLException -> 0x027b, TryCatch #5 {IllegalArgumentException -> 0x0279, MalformedURLException -> 0x027b, blocks: (B:78:0x022a, B:80:0x0272, B:85:0x027d, B:87:0x0283, B:89:0x028b, B:90:0x0291, B:91:0x0295), top: B:108:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0283 A[Catch: IllegalArgumentException -> 0x0279, MalformedURLException -> 0x027b, TryCatch #5 {IllegalArgumentException -> 0x0279, MalformedURLException -> 0x027b, blocks: (B:78:0x022a, B:80:0x0272, B:85:0x027d, B:87:0x0283, B:89:0x028b, B:90:0x0291, B:91:0x0295), top: B:108:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:89:0x028b A[Catch: IllegalArgumentException -> 0x0279, MalformedURLException -> 0x027b, TryCatch #5 {IllegalArgumentException -> 0x0279, MalformedURLException -> 0x027b, blocks: (B:78:0x022a, B:80:0x0272, B:85:0x027d, B:87:0x0283, B:89:0x028b, B:90:0x0291, B:91:0x0295), top: B:108:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02af  */
    @Override // defpackage.v8c
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        tvc tvcVarP;
        tkc tkcVar;
        jgc jgcVar;
        z7c z7cVarX;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        tkc tkcVar2;
        URL url;
        String strConcat;
        hrc hrcVar = this.e;
        final tkc tkcVar3 = hrcVar.a;
        zic zicVar = tkcVar3.e;
        thc thcVar = tkcVar3.f;
        fkc fkcVar = tkcVar3.g;
        tkc.m(fkcVar);
        fkcVar.g();
        src srcVar = tkcVar3.o;
        tkc.m(srcVar);
        tkc tkcVar4 = srcVar.a;
        tkc.m(srcVar);
        String strM = tkcVar3.r().m();
        Boolean boolT = tkcVar3.d.t("google_analytics_adid_collection_enabled");
        boolean z = false;
        if (boolT == null || boolT.booleanValue()) {
            tkc.k(zicVar);
            tkc tkcVar5 = zicVar.a;
            zicVar.g();
            if (zicVar.n().i(lnc.AD_STORAGE)) {
                tkcVar5.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String str3 = zicVar.h;
                if (str3 == null || jElapsedRealtime >= zicVar.j) {
                    zicVar.j = tkcVar5.d.o(strM, wfc.b) + jElapsedRealtime;
                    try {
                        be.a aVarA = be.a(tkcVar5.a);
                        zicVar.h = BuildConfig.FLAVOR;
                        String str4 = aVarA.a;
                        if (str4 != null) {
                            zicVar.h = str4;
                        }
                        zicVar.i = aVarA.b;
                    } catch (Exception e) {
                        thc thcVar2 = tkcVar5.f;
                        tkc.m(thcVar2);
                        thcVar2.m.b(e, "Unable to get advertising id");
                        zicVar.h = BuildConfig.FLAVOR;
                    }
                    pair = new Pair(zicVar.h, Boolean.valueOf(zicVar.i));
                } else {
                    pair = new Pair(str3, Boolean.valueOf(zicVar.i));
                }
            } else {
                pair = new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
            }
            if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                tkc.m(thcVar);
                thcVar.n.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            } else {
                tkc.m(srcVar);
                srcVar.i();
                ConnectivityManager connectivityManager = (ConnectivityManager) tkcVar4.a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    } catch (SecurityException unused) {
                        activeNetworkInfo = null;
                    }
                } else {
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    tkc.m(thcVar);
                    thcVar.i.a("Network is not available for Deferred Deep Link request. Skipping");
                } else {
                    StringBuilder sb = new StringBuilder();
                    tvc tvcVarP2 = tkcVar3.p();
                    tvcVarP2.g();
                    tvcVarP2.h();
                    if (tvcVarP2.n()) {
                        yzc yzcVar = tvcVarP2.a.i;
                        tkc.k(yzcVar);
                        if (yzcVar.S() >= 234200) {
                            hrc hrcVar2 = tkcVar3.m;
                            tkc.l(hrcVar2);
                            tkc tkcVar6 = hrcVar2.a;
                            hrcVar2.g();
                            tvcVarP = tkcVar6.p();
                            tkcVar = tvcVarP.a;
                            tvcVarP.g();
                            tvcVarP.h();
                            jgcVar = tvcVarP.d;
                            if (jgcVar == null) {
                                tvcVarP.m();
                                thc thcVar3 = tkcVar.f;
                                tkc.m(thcVar3);
                                thcVar3.m.a("Failed to get consents; not connected to service yet.");
                            } else {
                                z7cVarX = jgcVar.x(tvcVarP.w(false));
                                tvcVarP.t();
                                if (z7cVarX != null) {
                                    bundle = z7cVarX.t;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = tkcVar3.B;
                                    tkcVar3.B = i + 1;
                                    if (i < 10) {
                                    }
                                    tkc.m(thcVar);
                                    phc phcVar = thcVar.m;
                                    StringBuilder sb2 = new StringBuilder(69);
                                    sb2.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    phcVar.b(Integer.valueOf(tkcVar3.B), av.a(sb2, str2, " retryCount"));
                                } else {
                                    nnc nncVarB = nnc.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(nncVarB.f());
                                    m9c m9cVarC = m9c.c(100, bundle);
                                    str = m9cVarC.d;
                                    sb.append("&dma=");
                                    Boolean bool2 = m9cVarC.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = nnc.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i2);
                                    tkc.m(thcVar);
                                    thcVar.n.b(sb, "Consent query parameters to Bow");
                                    yzc yzcVar2 = tkcVar3.i;
                                    tkc.k(yzcVar2);
                                    tkcVar3.r().a.d.m();
                                    String str5 = (String) pair.first;
                                    long jA = zicVar.u.a() - 1;
                                    string = sb.toString();
                                    tkcVar2 = yzcVar2.a;
                                    a78.d(str5);
                                    a78.d(strM);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + yzcVar2.S()) + "&rdid=" + str5 + "&bundleid=" + strM + "&retry=" + jA;
                                    if (strM.equals(tkcVar2.d.k("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        tkc.m(srcVar);
                                        mrc mrcVar = new mrc() { // from class: rkc
                                            @Override // defpackage.mrc
                                            public final /* synthetic */ void a(String str6, int i3, Throwable th, byte[] bArr, Map map) {
                                                tkcVar3.i(i3, th, bArr);
                                            }
                                        };
                                        srcVar.i();
                                        fkc fkcVar2 = tkcVar4.g;
                                        tkc.m(fkcVar2);
                                        fkcVar2.s(new qrc(srcVar, strM, url, null, null, mrcVar));
                                    }
                                }
                            }
                            z7cVarX = null;
                            if (z7cVarX != null) {
                                bundle = z7cVarX.t;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                i = tkcVar3.B;
                                tkcVar3.B = i + 1;
                                if (i < 10) {
                                }
                                tkc.m(thcVar);
                                phc phcVar2 = thcVar.m;
                                StringBuilder sb3 = new StringBuilder(69);
                                sb3.append("Failed to retrieve DMA consent from the service, ");
                                if (i < 10) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                phcVar2.b(Integer.valueOf(tkcVar3.B), av.a(sb3, str2, " retryCount"));
                            } else {
                                nnc nncVarB2 = nnc.b(100, bundle);
                                sb.append("&gcs=");
                                sb.append(nncVarB2.f());
                                m9c m9cVarC2 = m9c.c(100, bundle);
                                str = m9cVarC2.d;
                                sb.append("&dma=");
                                Boolean bool3 = m9cVarC2.c;
                                bool = Boolean.FALSE;
                                sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append("&dma_cps=");
                                    sb.append(str);
                                }
                                iOrdinal = nnc.d(bundle.getString("ad_personalization")).ordinal();
                                if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        bool = null;
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                sb.append("&npa=");
                                sb.append(i3);
                                tkc.m(thcVar);
                                thcVar.n.b(sb, "Consent query parameters to Bow");
                                yzc yzcVar3 = tkcVar3.i;
                                tkc.k(yzcVar3);
                                tkcVar3.r().a.d.m();
                                String str6 = (String) pair.first;
                                long jA2 = zicVar.u.a() - 1;
                                string = sb.toString();
                                tkcVar2 = yzcVar3.a;
                                a78.d(str6);
                                a78.d(strM);
                                strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + yzcVar3.S()) + "&rdid=" + str6 + "&bundleid=" + strM + "&retry=" + jA2;
                                if (strM.equals(tkcVar2.d.k("debug.deferred.deeplink"))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                if (!string.isEmpty()) {
                                    if (string.charAt(0) != '&') {
                                        strConcat = strConcat.concat("&");
                                    }
                                    strConcat = strConcat.concat(string);
                                }
                                url = new URL(strConcat);
                                if (url != null) {
                                    tkc.m(srcVar);
                                    mrc mrcVar2 = new mrc() { // from class: rkc
                                        @Override // defpackage.mrc
                                        public final /* synthetic */ void a(String str7, int i4, Throwable th, byte[] bArr, Map map) {
                                            tkcVar3.i(i4, th, bArr);
                                        }
                                    };
                                    srcVar.i();
                                    fkc fkcVar3 = tkcVar4.g;
                                    tkc.m(fkcVar3);
                                    fkcVar3.s(new qrc(srcVar, strM, url, null, null, mrcVar2));
                                }
                            }
                        } else {
                            yzc yzcVar4 = tkcVar3.i;
                            tkc.k(yzcVar4);
                            tkcVar3.r().a.d.m();
                            String str7 = (String) pair.first;
                            long jA3 = zicVar.u.a() - 1;
                            string = sb.toString();
                            tkcVar2 = yzcVar4.a;
                            a78.d(str7);
                            a78.d(strM);
                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + yzcVar4.S()) + "&rdid=" + str7 + "&bundleid=" + strM + "&retry=" + jA3;
                            if (strM.equals(tkcVar2.d.k("debug.deferred.deeplink"))) {
                                strConcat = strConcat.concat("&ddl_test=1");
                            }
                            if (!string.isEmpty()) {
                                if (string.charAt(0) != '&') {
                                    strConcat = strConcat.concat("&");
                                }
                                strConcat = strConcat.concat(string);
                            }
                            url = new URL(strConcat);
                            if (url != null) {
                                tkc.m(srcVar);
                                mrc mrcVar3 = new mrc() { // from class: rkc
                                    @Override // defpackage.mrc
                                    public final /* synthetic */ void a(String str8, int i4, Throwable th, byte[] bArr, Map map) {
                                        tkcVar3.i(i4, th, bArr);
                                    }
                                };
                                srcVar.i();
                                fkc fkcVar4 = tkcVar4.g;
                                tkc.m(fkcVar4);
                                fkcVar4.s(new qrc(srcVar, strM, url, null, null, mrcVar3));
                            }
                        }
                    } else {
                        hrc hrcVar3 = tkcVar3.m;
                        tkc.l(hrcVar3);
                        tkc tkcVar7 = hrcVar3.a;
                        hrcVar3.g();
                        tvcVarP = tkcVar7.p();
                        tkcVar = tvcVarP.a;
                        tvcVarP.g();
                        tvcVarP.h();
                        jgcVar = tvcVarP.d;
                        if (jgcVar == null) {
                            tvcVarP.m();
                            thc thcVar4 = tkcVar.f;
                            tkc.m(thcVar4);
                            thcVar4.m.a("Failed to get consents; not connected to service yet.");
                        } else {
                            try {
                                z7cVarX = jgcVar.x(tvcVarP.w(false));
                                tvcVarP.t();
                            } catch (RemoteException e2) {
                                thc thcVar5 = tkcVar.f;
                                tkc.m(thcVar5);
                                thcVar5.f.b(e2, "Failed to get consents; remote exception");
                                z7cVarX = null;
                            }
                            if (z7cVarX != null) {
                                bundle = z7cVarX.t;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                i = tkcVar3.B;
                                tkcVar3.B = i + 1;
                                z = i < 10;
                                tkc.m(thcVar);
                                phc phcVar3 = thcVar.m;
                                StringBuilder sb4 = new StringBuilder(69);
                                sb4.append("Failed to retrieve DMA consent from the service, ");
                                if (i < 10) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                phcVar3.b(Integer.valueOf(tkcVar3.B), av.a(sb4, str2, " retryCount"));
                            } else {
                                nnc nncVarB3 = nnc.b(100, bundle);
                                sb.append("&gcs=");
                                sb.append(nncVarB3.f());
                                m9c m9cVarC3 = m9c.c(100, bundle);
                                str = m9cVarC3.d;
                                sb.append("&dma=");
                                Boolean bool4 = m9cVarC3.c;
                                bool = Boolean.FALSE;
                                sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append("&dma_cps=");
                                    sb.append(str);
                                }
                                iOrdinal = nnc.d(bundle.getString("ad_personalization")).ordinal();
                                if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        bool = null;
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                sb.append("&npa=");
                                sb.append(i4);
                                tkc.m(thcVar);
                                thcVar.n.b(sb, "Consent query parameters to Bow");
                                yzc yzcVar5 = tkcVar3.i;
                                tkc.k(yzcVar5);
                                tkcVar3.r().a.d.m();
                                String str8 = (String) pair.first;
                                long jA4 = zicVar.u.a() - 1;
                                string = sb.toString();
                                tkcVar2 = yzcVar5.a;
                                try {
                                    a78.d(str8);
                                    a78.d(strM);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + yzcVar5.S()) + "&rdid=" + str8 + "&bundleid=" + strM + "&retry=" + jA4;
                                    if (strM.equals(tkcVar2.d.k("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    thc thcVar6 = tkcVar2.f;
                                    tkc.m(thcVar6);
                                    thcVar6.f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                } catch (MalformedURLException e4) {
                                    e = e4;
                                    thc thcVar7 = tkcVar2.f;
                                    tkc.m(thcVar7);
                                    thcVar7.f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                }
                                if (url != null) {
                                    tkc.m(srcVar);
                                    mrc mrcVar4 = new mrc() { // from class: rkc
                                        @Override // defpackage.mrc
                                        public final /* synthetic */ void a(String str9, int i5, Throwable th, byte[] bArr, Map map) {
                                            tkcVar3.i(i5, th, bArr);
                                        }
                                    };
                                    srcVar.i();
                                    fkc fkcVar5 = tkcVar4.g;
                                    tkc.m(fkcVar5);
                                    fkcVar5.s(new qrc(srcVar, strM, url, null, null, mrcVar4));
                                }
                            }
                        }
                        z7cVarX = null;
                        if (z7cVarX != null) {
                            bundle = z7cVarX.t;
                        } else {
                            bundle = null;
                        }
                        if (bundle == null) {
                            i = tkcVar3.B;
                            tkcVar3.B = i + 1;
                            if (i < 10) {
                            }
                            tkc.m(thcVar);
                            phc phcVar4 = thcVar.m;
                            StringBuilder sb5 = new StringBuilder(69);
                            sb5.append("Failed to retrieve DMA consent from the service, ");
                            if (i < 10) {
                                str2 = "Retrying.";
                            } else {
                                str2 = "Skipping.";
                            }
                            phcVar4.b(Integer.valueOf(tkcVar3.B), av.a(sb5, str2, " retryCount"));
                        } else {
                            nnc nncVarB4 = nnc.b(100, bundle);
                            sb.append("&gcs=");
                            sb.append(nncVarB4.f());
                            m9c m9cVarC4 = m9c.c(100, bundle);
                            str = m9cVarC4.d;
                            sb.append("&dma=");
                            Boolean bool5 = m9cVarC4.c;
                            bool = Boolean.FALSE;
                            sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                            if (!TextUtils.isEmpty(str)) {
                                sb.append("&dma_cps=");
                                sb.append(str);
                            }
                            iOrdinal = nnc.d(bundle.getString("ad_personalization")).ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    bool = null;
                                } else {
                                    bool = Boolean.TRUE;
                                }
                            }
                            int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                            sb.append("&npa=");
                            sb.append(i5);
                            tkc.m(thcVar);
                            thcVar.n.b(sb, "Consent query parameters to Bow");
                            yzc yzcVar6 = tkcVar3.i;
                            tkc.k(yzcVar6);
                            tkcVar3.r().a.d.m();
                            String str9 = (String) pair.first;
                            long jA5 = zicVar.u.a() - 1;
                            string = sb.toString();
                            tkcVar2 = yzcVar6.a;
                            a78.d(str9);
                            a78.d(strM);
                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + yzcVar6.S()) + "&rdid=" + str9 + "&bundleid=" + strM + "&retry=" + jA5;
                            if (strM.equals(tkcVar2.d.k("debug.deferred.deeplink"))) {
                                strConcat = strConcat.concat("&ddl_test=1");
                            }
                            if (!string.isEmpty()) {
                                if (string.charAt(0) != '&') {
                                    strConcat = strConcat.concat("&");
                                }
                                strConcat = strConcat.concat(string);
                            }
                            url = new URL(strConcat);
                            if (url != null) {
                                tkc.m(srcVar);
                                mrc mrcVar5 = new mrc() { // from class: rkc
                                    @Override // defpackage.mrc
                                    public final /* synthetic */ void a(String str10, int i6, Throwable th, byte[] bArr, Map map) {
                                        tkcVar3.i(i6, th, bArr);
                                    }
                                };
                                srcVar.i();
                                fkc fkcVar6 = tkcVar4.g;
                                tkc.m(fkcVar6);
                                fkcVar6.s(new qrc(srcVar, strM, url, null, null, mrcVar5));
                            }
                        }
                    }
                }
            }
        } else {
            tkc.m(thcVar);
            thcVar.n.a("ADID collection is disabled from Manifest. Skipping");
        }
        if (z) {
            hrcVar.s.b(2000L);
        }
    }
}
