package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hrc extends dgc {
    public fqc c;
    public yyc d;
    public final CopyOnWriteArraySet e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public boolean i;
    public int j;
    public hoc k;
    public boc l;
    public PriorityQueue m;
    public nnc n;
    public final AtomicLong o;
    public long p;
    public final s7d q;
    public boolean r;
    public dpc s;
    public xqc t;
    public voc u;
    public final opc v;

    public hrc(tkc tkcVar) {
        super(tkcVar);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.j = 1;
        this.r = true;
        this.v = new opc(this);
        this.g = new AtomicReference();
        this.n = nnc.c;
        this.p = -1L;
        this.o = new AtomicLong(0L);
        this.q = new s7d(tkcVar);
    }

    public final void A(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        hnc hncVar;
        Boolean bool2;
        h();
        nnc nncVar = nnc.c;
        lnc[] lncVarArr = jnc.STORAGE.t;
        int length = lncVarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = lncVarArr[i2].t;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        tkc tkcVar = this.a;
        if (string != null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.k.b(string, "Ignoring invalid consent setting");
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.k.a("Valid consent values are 'granted', 'denied'");
        }
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        boolean zM = fkcVar.m();
        nnc nncVarB = nnc.b(i, bundle);
        Iterator it = nncVarB.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            hncVar = hnc.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((hnc) it.next()) != hncVar) {
                C(nncVarB, zM);
                break;
            }
        }
        m9c m9cVarC = m9c.c(i, bundle);
        Iterator it2 = m9cVarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((hnc) it2.next()) != hncVar) {
                B(m9cVarC, zM);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = nnc.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM) {
                r(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                q(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void B(m9c m9cVar, boolean z) {
        wpc wpcVar = new wpc(this, m9cVar);
        if (z) {
            g();
            wpcVar.run();
        } else {
            fkc fkcVar = this.a.g;
            tkc.m(fkcVar);
            fkcVar.p(wpcVar);
        }
    }

    public final void C(nnc nncVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        nnc nncVar2;
        h();
        int i = nncVar.b;
        if (i != -10) {
            hnc hncVar = (hnc) nncVar.a.get(lnc.AD_STORAGE);
            if (hncVar == null) {
                hncVar = hnc.UNINITIALIZED;
            }
            hnc hncVar2 = hnc.UNINITIALIZED;
            if (hncVar == hncVar2) {
                hnc hncVar3 = (hnc) nncVar.a.get(lnc.ANALYTICS_STORAGE);
                if (hncVar3 == null) {
                    hncVar3 = hncVar2;
                }
                if (hncVar3 == hncVar2) {
                    thc thcVar = this.a.f;
                    tkc.m(thcVar);
                    thcVar.k.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.h) {
            try {
                z2 = false;
                if (nnc.l(i, this.n.b)) {
                    nnc nncVar3 = this.n;
                    EnumMap enumMap = nncVar.a;
                    lnc[] lncVarArr = (lnc[]) enumMap.keySet().toArray(new lnc[0]);
                    int length = lncVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        lnc lncVar = lncVarArr[i2];
                        hnc hncVar4 = (hnc) enumMap.get(lncVar);
                        hnc hncVar5 = (hnc) nncVar3.a.get(lncVar);
                        hnc hncVar6 = hnc.DENIED;
                        if (hncVar4 == hncVar6 && hncVar5 != hncVar6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    lnc lncVar2 = lnc.ANALYTICS_STORAGE;
                    if (nncVar.i(lncVar2) && !this.n.i(lncVar2)) {
                        z2 = true;
                    }
                    nncVar = nncVar.k(this.n);
                    this.n = nncVar;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                nncVar2 = nncVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            thc thcVar2 = this.a.f;
            tkc.m(thcVar2);
            thcVar2.l.b(nncVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.o.getAndIncrement();
        if (z3) {
            this.g.set(null);
            ypc ypcVar = new ypc(this, nncVar2, andIncrement, z4);
            if (z) {
                g();
                ypcVar.run();
                return;
            } else {
                fkc fkcVar = this.a.g;
                tkc.m(fkcVar);
                fkcVar.r(ypcVar);
                return;
            }
        }
        aqc aqcVar = new aqc(this, nncVar2, andIncrement, z4);
        if (z) {
            g();
            aqcVar.run();
        } else if (i == 30 || i == -10) {
            fkc fkcVar2 = this.a.g;
            tkc.m(fkcVar2);
            fkcVar2.r(aqcVar);
        } else {
            fkc fkcVar3 = this.a.g;
            tkc.m(fkcVar3);
            fkcVar3.p(aqcVar);
        }
    }

    public final void D() {
        o6c.a();
        tkc tkcVar = this.a;
        t7c t7cVar = tkcVar.d;
        fkc fkcVar = tkcVar.g;
        thc thcVar = tkcVar.f;
        if (t7cVar.r(null, wfc.P0)) {
            tkc.m(fkcVar);
            if (fkcVar.m()) {
                tkc.m(thcVar);
                thcVar.f.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (pd7.b()) {
                tkc.m(thcVar);
                thcVar.f.a("Cannot get trigger URIs from main thread");
                return;
            }
            h();
            tkc.m(thcVar);
            thcVar.n.a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            tkc.m(fkcVar);
            fkcVar.q(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: qqc
                @Override // java.lang.Runnable
                public final void run() {
                    hrc hrcVar = this.t;
                    zic zicVar = hrcVar.a.e;
                    tkc.k(zicVar);
                    final Bundle bundleA = zicVar.n.a();
                    final tvc tvcVarP = hrcVar.a.p();
                    tvcVarP.g();
                    tvcVarP.h();
                    final q1d q1dVarW = tvcVarP.w(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    tvcVarP.u(new Runnable() { // from class: lvc
                        @Override // java.lang.Runnable
                        public final void run() {
                            tvc tvcVar = tvcVarP;
                            AtomicReference atomicReference3 = atomicReference2;
                            q1d q1dVar = q1dVarW;
                            Bundle bundle = bundleA;
                            synchronized (atomicReference3) {
                                try {
                                    jgc jgcVar = tvcVar.d;
                                    if (jgcVar != null) {
                                        jgcVar.M(q1dVar, bundle, new ctc(tvcVar, atomicReference3));
                                        tvcVar.t();
                                    } else {
                                        thc thcVar2 = tvcVar.a.f;
                                        tkc.m(thcVar2);
                                        thcVar2.f.a("Failed to request trigger URIs; not connected to service");
                                    }
                                } catch (RemoteException e) {
                                    thc thcVar3 = tvcVar.a.f;
                                    tkc.m(thcVar3);
                                    thcVar3.f.b(e, "Failed to request trigger URIs; remote exception");
                                    atomicReference3.notifyAll();
                                }
                            }
                        }
                    });
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                tkc.m(thcVar);
                thcVar.h.a("Timed out waiting for get trigger URIs");
            } else {
                tkc.m(fkcVar);
                fkcVar.p(new Runnable() { // from class: sqc
                    @Override // java.lang.Runnable
                    public final void run() {
                        hrc hrcVar = this.t;
                        hrcVar.g();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        zic zicVar = hrcVar.a.e;
                        tkc.k(zicVar);
                        SparseArray sparseArrayM = zicVar.m();
                        for (kxc kxcVar : list) {
                            int i = kxcVar.v;
                            if (!sparseArrayM.contains(i) || ((Long) sparseArrayM.get(i)).longValue() < kxcVar.u) {
                                hrcVar.E().add(kxcVar);
                            }
                        }
                        hrcVar.F();
                    }
                });
            }
        }
    }

    public final PriorityQueue E() {
        if (this.m == null) {
            this.m = new PriorityQueue(Comparator.comparing(tqc.a, vqc.t));
        }
        return this.m;
    }

    public final void F() {
        kxc kxcVar;
        g();
        if (E().isEmpty() || this.i || (kxcVar = (kxc) E().poll()) == null) {
            return;
        }
        tkc tkcVar = this.a;
        yzc yzcVar = tkcVar.i;
        tkc.k(yzcVar);
        pl6 pl6VarC = yzcVar.C();
        if (pl6VarC != null) {
            this.i = true;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            phc phcVar = thcVar.n;
            String str = kxcVar.t;
            phcVar.b(str, "Registering trigger URI");
            ListenableFuture<g2b> listenableFutureB = pl6VarC.b(Uri.parse(str));
            if (listenableFutureB != null) {
                listenableFutureB.Q(new ti4.a(listenableFutureB, new foc(this, kxcVar)), new doc(this));
            } else {
                this.i = false;
                E().add(kxcVar);
            }
        }
    }

    public final void G(nnc nncVar) {
        g();
        boolean z = (nncVar.i(lnc.ANALYTICS_STORAGE) && nncVar.i(lnc.AD_STORAGE)) || this.a.p().p();
        tkc tkcVar = this.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.g();
        if (z != tkcVar.z) {
            fkc fkcVar2 = tkcVar.g;
            tkc.m(fkcVar2);
            fkcVar2.g();
            tkcVar.z = z;
            zic zicVar = this.a.e;
            tkc.k(zicVar);
            zicVar.g();
            Boolean boolValueOf = zicVar.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(zicVar.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                x(Boolean.valueOf(z), false);
            }
        }
    }

    @Override // defpackage.dgc
    public final boolean j() {
        return false;
    }

    public final void k(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        tkc tkcVar = this.a;
        tkcVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (tkcVar.d.r(null, wfc.e1)) {
            tkcVar.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        l(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r5 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrc.l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0258  */
    /* JADX WARN: Code duplicated, block: B:101:0x025d  */
    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0271  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x0319  */
    /* JADX WARN: Code duplicated, block: B:115:0x0337  */
    /* JADX WARN: Code duplicated, block: B:118:0x0359  */
    /* JADX WARN: Code duplicated, block: B:120:0x0370  */
    /* JADX WARN: Code duplicated, block: B:123:0x037b  */
    /* JADX WARN: Code duplicated, block: B:124:0x037e  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:129:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0420  */
    /* JADX WARN: Code duplicated, block: B:142:0x0440  */
    /* JADX WARN: Code duplicated, block: B:143:0x0453  */
    /* JADX WARN: Code duplicated, block: B:149:0x046c  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:169:0x04e6 A[Catch: NumberFormatException -> 0x04eb, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x04eb, blocks: (B:167:0x04da, B:169:0x04e6), top: B:205:0x04da }] */
    /* JADX WARN: Code duplicated, block: B:171:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x0508  */
    /* JADX WARN: Code duplicated, block: B:183:0x051f  */
    /* JADX WARN: Code duplicated, block: B:186:0x052e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0533  */
    /* JADX WARN: Code duplicated, block: B:191:0x0541  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:85:0x0208  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0222  */
    /* JADX WARN: Code duplicated, block: B:92:0x0230  */
    /* JADX WARN: Code duplicated, block: B:93:0x0235  */
    /* JADX WARN: Code duplicated, block: B:96:0x0244  */
    /* JADX WARN: Code duplicated, block: B:97:0x0249  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x03d8, please report this as an issue */
    public final void m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        m95.a aVarA;
        w2b it;
        wzb wzbVar;
        tkc tkcVar;
        boolean z;
        dxc dxcVar;
        wzb wzbVar2;
        wzb wzbVar3;
        wzb wzbVar4;
        wzb wzbVar5;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int i6;
        String str;
        String str2;
        int i7;
        String str3;
        int i8;
        String str4;
        String str5;
        String str6;
        vl8 vl8VarA;
        String string;
        HashMap map;
        int i9;
        int i10;
        dxc dxcVar2;
        String[] strArrSplit;
        String string2;
        String strA;
        Bundle bundleB;
        hrc hrcVar;
        HashMap map2;
        String str7;
        Bundle bundleB2;
        Bundle bundleB3;
        String str8;
        HashMap map3;
        String str9;
        StringBuilder sb;
        int i11;
        int iC;
        int i12;
        boolean zEquals;
        int i13;
        String str10;
        wzb wzbVar6;
        g();
        tkc tkcVar2 = this.a;
        thc thcVar = tkcVar2.f;
        thc thcVar2 = tkcVar2.f;
        tkc.m(thcVar);
        thcVar.m.a("Handle tcf update.");
        zic zicVar = tkcVar2.e;
        tkc.k(zicVar);
        SharedPreferences sharedPreferencesL = zicVar.l();
        ul8 ul8Var = gxc.a;
        vzb vzbVar = vzb.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        fxc fxcVar = fxc.t;
        vzb vzbVar2 = vzb.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        fxc fxcVar2 = fxc.u;
        vzb vzbVar3 = vzb.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        vzb vzbVar4 = vzb.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        vzb vzbVar5 = vzb.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        vl8 vl8VarF = vl8.f(7, new Object[]{vzbVar, fxcVar, vzbVar2, fxcVar2, vzbVar3, fxcVar, vzbVar4, fxcVar, vzbVar5, fxcVar2, vzb.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, fxcVar2, vzb.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, fxcVar2}, null);
        int i14 = q95.v;
        xq9 xq9Var = new xq9("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesL.contains("IABTCF_TCString");
        try {
            i = sharedPreferencesL.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            try {
                try {
                    try {
                        i2 = sharedPreferencesL.getInt("IABTCF_PolicyVersion", -1);
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            wzbVar = wzb.PURPOSE_RESTRICTION_UNDEFINED;
                            if (!zHasNext) {
                                break;
                            }
                            vzb vzbVar6 = (vzb) it.next();
                            vl8 vl8Var = vl8VarF;
                            int iA5 = vzbVar6.a();
                            w2b w2bVar = it;
                            xq9 xq9Var2 = xq9Var;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iA5).length() + 28);
                            sb2.append("IABTCF_PublisherRestrictions");
                            sb2.append(iA5);
                            String strA2 = gxc.a(sharedPreferencesL, sb2.toString());
                            if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                                wzbVar6 = wzbVar;
                            } else {
                                int iDigit = Character.digit(strA2.charAt(754), 10);
                                wzbVar6 = wzb.PURPOSE_RESTRICTION_NOT_ALLOWED;
                                if (iDigit >= 0 && iDigit <= wzb.values().length && iDigit != 0) {
                                    if (iDigit == 1) {
                                        wzbVar = wzb.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                                    } else if (iDigit == 2) {
                                        wzbVar = wzb.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                                    }
                                    wzbVar6 = wzbVar;
                                }
                            }
                            aVarA.b(vzbVar6, wzbVar6);
                            vl8VarF = vl8Var;
                            it = w2bVar;
                            xq9Var = xq9Var2;
                        }
                    } catch (ClassCastException unused2) {
                        i2 = -1;
                    }
                    i5 = sharedPreferencesL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
                } catch (ClassCastException unused3) {
                    i5 = -1;
                }
                i3 = sharedPreferencesL.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused4) {
                i3 = -1;
            }
            i4 = sharedPreferencesL.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused5) {
            i4 = -1;
        }
        int i15 = i2;
        String strA3 = gxc.a(sharedPreferencesL, "IABTCF_PublisherCC");
        aVarA = m95.a();
        int i16 = i;
        q95 q95VarD = vl8VarF.u;
        if (q95VarD == null) {
            q95VarD = vl8VarF.d();
            vl8VarF.u = q95VarD;
        }
        it = q95VarD.iterator();
        vl8 vl8Var2 = vl8VarF;
        xq9 xq9Var3 = xq9Var;
        vl8 vl8VarA2 = aVarA.a(true);
        String strA4 = gxc.a(sharedPreferencesL, "IABTCF_PurposeConsents");
        String strA5 = gxc.a(sharedPreferencesL, "IABTCF_VendorConsents");
        boolean z4 = !TextUtils.isEmpty(strA5) && strA5.length() >= 755 && strA5.charAt(754) == '1';
        String strA6 = gxc.a(sharedPreferencesL, "IABTCF_PurposeLegitimateInterests");
        String strA7 = gxc.a(sharedPreferencesL, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strA7)) {
            tkcVar = tkcVar2;
            if (strA7.length() >= 755 && strA7.charAt(754) == '1') {
                z = true;
            }
            cArr[0] = '2';
            if (zContains) {
                wzbVar2 = (wzb) vl8VarA2.get(vzbVar);
                wzbVar3 = (wzb) vl8VarA2.get(vzbVar3);
                wzbVar4 = (wzb) vl8VarA2.get(vzbVar4);
                wzbVar5 = (wzb) vl8VarA2.get(vzbVar5);
                m95.a aVarA2 = m95.a();
                aVarA2.b("Version", "2");
                if (true != z4) {
                    obj = "0";
                } else {
                    obj = "1";
                }
                z2 = z4;
                aVarA2.b("VendorConsent", obj);
                if (true != z) {
                    obj2 = "0";
                } else {
                    obj2 = "1";
                }
                z3 = z;
                aVarA2.b("VendorLegitimateInterest", obj2);
                if (i3 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = "1";
                }
                aVarA2.b("gdprApplies", obj3);
                if (i5 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = "1";
                }
                aVarA2.b("EnableAdvertiserConsentMode", obj4);
                aVarA2.b("PolicyVersion", String.valueOf(i15));
                aVarA2.b("CmpSdkID", String.valueOf(i16));
                if (i4 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = "1";
                }
                aVarA2.b("PurposeOneTreatment", obj5);
                aVarA2.b("PublisherCC", strA3);
                if (wzbVar2 != null) {
                    iA = wzbVar2.a();
                } else {
                    iA = wzbVar.a();
                }
                aVarA2.b("PublisherRestrictions1", String.valueOf(iA));
                if (wzbVar3 != null) {
                    iA2 = wzbVar3.a();
                } else {
                    iA2 = wzbVar.a();
                }
                aVarA2.b("PublisherRestrictions3", String.valueOf(iA2));
                if (wzbVar4 != null) {
                    iA3 = wzbVar4.a();
                } else {
                    iA3 = wzbVar.a();
                }
                aVarA2.b("PublisherRestrictions4", String.valueOf(iA3));
                if (wzbVar5 != null) {
                    iA4 = wzbVar5.a();
                } else {
                    iA4 = wzbVar.a();
                }
                aVarA2.b("PublisherRestrictions7", String.valueOf(iA4));
                i6 = i3;
                aVarA2.c(vl8.f(4, new Object[]{"Purpose1", gxc.d(vzbVar, strA4, strA6), "Purpose3", gxc.d(vzbVar3, strA4, strA6), "Purpose4", gxc.d(vzbVar4, strA4, strA6), "Purpose7", gxc.d(vzbVar5, strA4, strA6)}, null).entrySet());
                str = "0";
                str2 = "1";
                i7 = i4;
                if (true != gxc.b(vzbVar, vl8Var2, vl8VarA2, xq9Var3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                i8 = i5;
                if (true != gxc.b(vzbVar3, vl8Var2, vl8VarA2, xq9Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                if (true != gxc.b(vzbVar4, vl8Var2, vl8VarA2, xq9Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str5 = str;
                } else {
                    str5 = str2;
                }
                if (true != gxc.b(vzbVar5, vl8Var2, vl8VarA2, xq9Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str6 = str;
                } else {
                    str6 = str2;
                }
                aVarA2.c(vl8.f(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                vl8VarA = aVarA2.a(true);
            } else {
                vl8VarA = vl8.z;
                str2 = "1";
                str = "0";
            }
            dxcVar = new dxc(vl8VarA);
            tkc.m(thcVar2);
            thcVar2.n.b(dxcVar, "Tcf preferences read");
            zicVar.g();
            string = zicVar.k().getString("stored_tcf_param", BuildConfig.FLAVOR);
            map = new HashMap();
            if (TextUtils.isEmpty(string)) {
                dxcVar2 = new dxc(map);
                i10 = 2;
            } else {
                for (String str11 : string.split(";")) {
                    strArrSplit = str11.split("=");
                    if (strArrSplit.length < 2 && gxc.a.contains(strArrSplit[0])) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                i10 = 2;
                dxcVar2 = new dxc(map);
            }
            zicVar.g();
            string2 = zicVar.k().getString("stored_tcf_param", BuildConfig.FLAVOR);
            strA = dxcVar.a();
            if (strA.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = zicVar.k().edit();
            editorEdit.putString("stored_tcf_param", strA);
            editorEdit.apply();
            bundleB = dxcVar.b();
            tkc.m(thcVar2);
            thcVar2.n.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                tkcVar.k.getClass();
                hrcVar = this;
                hrcVar.A(bundleB, -30, System.currentTimeMillis());
            } else {
                hrcVar = this;
            }
            Bundle bundle = new Bundle();
            map2 = dxcVar2.a;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str7 = str2;
            } else {
                str7 = str;
            }
            bundleB2 = dxcVar.b();
            bundleB3 = dxcVar2.b();
            if (bundleB2.size() != bundleB3.size() && Objects.equals(bundleB2.getString("ad_storage"), bundleB3.getString("ad_storage")) && Objects.equals(bundleB2.getString("ad_personalization"), bundleB3.getString("ad_personalization")) && Objects.equals(bundleB2.getString("ad_user_data"), bundleB3.getString("ad_user_data"))) {
                str8 = str;
            } else {
                str8 = str2;
            }
            bundle.putString("_tcfm", str7.concat(str8));
            map3 = dxcVar.a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            try {
                str10 = (String) map3.get("CmpSdkID");
                if (TextUtils.isEmpty(str10)) {
                    i11 = -1;
                } else {
                    i11 = Integer.parseInt(str10);
                }
            } catch (NumberFormatException unused6) {
            }
            if (i11 >= 0 || i11 > 4095) {
                sb.append("00");
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 >> 6));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
            }
            iC = dxcVar.c();
            if (iC >= 0 || iC > 63) {
                sb.append(str);
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iC));
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle.putString("_tcfd", sb.toString());
            hrcVar.n("auto", "_tcf", bundle);
        }
        tkcVar = tkcVar2;
        z = false;
        cArr[0] = '2';
        if (zContains) {
            vl8VarA = vl8.z;
            str2 = "1";
            str = "0";
        } else {
            wzbVar2 = (wzb) vl8VarA2.get(vzbVar);
            wzbVar3 = (wzb) vl8VarA2.get(vzbVar3);
            wzbVar4 = (wzb) vl8VarA2.get(vzbVar4);
            wzbVar5 = (wzb) vl8VarA2.get(vzbVar5);
            m95.a aVarA3 = m95.a();
            aVarA3.b("Version", "2");
            if (true != z4) {
                obj = "0";
            } else {
                obj = "1";
            }
            z2 = z4;
            aVarA3.b("VendorConsent", obj);
            if (true != z) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            z3 = z;
            aVarA3.b("VendorLegitimateInterest", obj2);
            if (i3 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            aVarA3.b("gdprApplies", obj3);
            if (i5 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            aVarA3.b("EnableAdvertiserConsentMode", obj4);
            aVarA3.b("PolicyVersion", String.valueOf(i15));
            aVarA3.b("CmpSdkID", String.valueOf(i16));
            if (i4 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            aVarA3.b("PurposeOneTreatment", obj5);
            aVarA3.b("PublisherCC", strA3);
            if (wzbVar2 != null) {
                iA = wzbVar2.a();
            } else {
                iA = wzbVar.a();
            }
            aVarA3.b("PublisherRestrictions1", String.valueOf(iA));
            if (wzbVar3 != null) {
                iA2 = wzbVar3.a();
            } else {
                iA2 = wzbVar.a();
            }
            aVarA3.b("PublisherRestrictions3", String.valueOf(iA2));
            if (wzbVar4 != null) {
                iA3 = wzbVar4.a();
            } else {
                iA3 = wzbVar.a();
            }
            aVarA3.b("PublisherRestrictions4", String.valueOf(iA3));
            if (wzbVar5 != null) {
                iA4 = wzbVar5.a();
            } else {
                iA4 = wzbVar.a();
            }
            aVarA3.b("PublisherRestrictions7", String.valueOf(iA4));
            i6 = i3;
            aVarA3.c(vl8.f(4, new Object[]{"Purpose1", gxc.d(vzbVar, strA4, strA6), "Purpose3", gxc.d(vzbVar3, strA4, strA6), "Purpose4", gxc.d(vzbVar4, strA4, strA6), "Purpose7", gxc.d(vzbVar5, strA4, strA6)}, null).entrySet());
            str = "0";
            str2 = "1";
            i7 = i4;
            if (true != gxc.b(vzbVar, vl8Var2, vl8VarA2, xq9Var3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            i8 = i5;
            if (true != gxc.b(vzbVar3, vl8Var2, vl8VarA2, xq9Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str4 = str;
            } else {
                str4 = str2;
            }
            if (true != gxc.b(vzbVar4, vl8Var2, vl8VarA2, xq9Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str5 = str;
            } else {
                str5 = str2;
            }
            if (true != gxc.b(vzbVar5, vl8Var2, vl8VarA2, xq9Var3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str6 = str;
            } else {
                str6 = str2;
            }
            aVarA3.c(vl8.f(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
            vl8VarA = aVarA3.a(true);
        }
        dxcVar = new dxc(vl8VarA);
        tkc.m(thcVar2);
        thcVar2.n.b(dxcVar, "Tcf preferences read");
        zicVar.g();
        string = zicVar.k().getString("stored_tcf_param", BuildConfig.FLAVOR);
        map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            dxcVar2 = new dxc(map);
            i10 = 2;
        } else {
            while (i9 < r10) {
                strArrSplit = str11.split("=");
                if (strArrSplit.length < 2) {
                }
            }
            i10 = 2;
            dxcVar2 = new dxc(map);
        }
        zicVar.g();
        string2 = zicVar.k().getString("stored_tcf_param", BuildConfig.FLAVOR);
        strA = dxcVar.a();
        if (strA.equals(string2)) {
            SharedPreferences.Editor editorEdit2 = zicVar.k().edit();
            editorEdit2.putString("stored_tcf_param", strA);
            editorEdit2.apply();
            bundleB = dxcVar.b();
            tkc.m(thcVar2);
            thcVar2.n.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                tkcVar.k.getClass();
                hrcVar = this;
                hrcVar.A(bundleB, -30, System.currentTimeMillis());
            } else {
                hrcVar = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = dxcVar2.a;
            if (map2.isEmpty()) {
                str7 = str;
            } else {
                str7 = str;
            }
            bundleB2 = dxcVar.b();
            bundleB3 = dxcVar2.b();
            if (bundleB2.size() != bundleB3.size()) {
                str8 = str2;
            } else {
                str8 = str;
            }
            bundle2.putString("_tcfm", str7.concat(str8));
            map3 = dxcVar.a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle2.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            str10 = (String) map3.get("CmpSdkID");
            if (TextUtils.isEmpty(str10)) {
                i11 = Integer.parseInt(str10);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                sb.append("00");
            } else {
                sb.append("00");
            }
            iC = dxcVar.c();
            if (iC >= 0) {
                sb.append(str);
            } else {
                sb.append(str);
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle2.putString("_tcfd", sb.toString());
            hrcVar.n("auto", "_tcf", bundle2);
        }
    }

    public final void n(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        g();
        tkc tkcVar = this.a;
        tkcVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (tkcVar.d.r(null, wfc.e1)) {
            tkcVar.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        o(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void o(long j, long j2, Bundle bundle, String str, String str2) {
        g();
        boolean z = true;
        if (this.d != null && !yzc.L(str2)) {
            z = false;
        }
        p(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227  */
    /* JADX WARN: Code duplicated, block: B:107:0x0279  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x02df  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:133:0x0306  */
    /* JADX WARN: Code duplicated, block: B:134:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0370  */
    /* JADX WARN: Code duplicated, block: B:144:0x0384  */
    /* JADX WARN: Code duplicated, block: B:145:0x039b  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:150:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:161:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:162:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:167:0x040d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0415  */
    /* JADX WARN: Code duplicated, block: B:171:0x041a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0422  */
    /* JADX WARN: Code duplicated, block: B:177:0x0461  */
    /* JADX WARN: Code duplicated, block: B:179:0x0472  */
    /* JADX WARN: Code duplicated, block: B:182:0x0486  */
    /* JADX WARN: Code duplicated, block: B:185:0x0492 A[LOOP:2: B:183:0x048c->B:185:0x0492, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:96:0x020b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0210  */
    public final void p(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        zic zicVar;
        opc opcVar;
        boolean z4;
        tkc tkcVar;
        int iO0;
        boolean z5;
        Bundle bundleQ;
        long j3;
        String strA;
        ArrayList arrayList;
        boolean zA;
        long j4;
        int i;
        long j5;
        long j6;
        ArrayList arrayList2;
        int size;
        int i2;
        int i3;
        Bundle bundleN;
        String str4;
        Bundle bundle2;
        chc chcVarO;
        byte[] bArrMarshall;
        boolean zN;
        Iterator it;
        String str5;
        ArrayList arrayList3;
        Object obj;
        Bundle[] bundleArr;
        int length;
        int i4;
        a78.d(str);
        a78.g(bundle);
        g();
        h();
        tkc tkcVar2 = this.a;
        boolean zD = tkcVar2.d();
        cxc cxcVar = tkcVar2.h;
        t7c t7cVar = tkcVar2.d;
        Context context = tkcVar2.a;
        yzc yzcVar = tkcVar2.i;
        thc thcVar = tkcVar2.f;
        if (!zD) {
            tkc.m(thcVar);
            thcVar.m.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = tkcVar2.r().k;
        if (list != null && !list.contains(str2)) {
            tkc.m(thcVar);
            thcVar.m.c(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!tkcVar2.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    tkc.m(thcVar);
                    thcVar.i.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                tkc.m(thcVar);
                thcVar.l.a("Tag Manager is not found and thus will not be used");
            }
        }
        fhc fhcVar = tkcVar2.j;
        zic zicVar2 = tkcVar2.e;
        mq2 mq2Var = tkcVar2.k;
        if (!t7cVar.r(null, wfc.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            mq2Var.getClass();
            str3 = null;
            r(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || yzc.j[0].equals(str2)) {
            zicVar = zicVar2;
        } else {
            tkc.k(yzcVar);
            tkc.k(zicVar2);
            zicVar = zicVar2;
            yzcVar.t(bundle, zicVar.y.a());
        }
        opc opcVar2 = this.v;
        if (!z3 && !"_iap".equals(str2)) {
            tkc.k(yzcVar);
            int i5 = 2;
            if (yzcVar.k0("event", str2)) {
                if (yzcVar.m0("event", oh7.a, yzcVar.a.d.r(str3, wfc.f1) ? oh7.c : oh7.b, str2)) {
                    i4 = 40;
                    if (yzcVar.n0(40, "event", str2)) {
                        i5 = 0;
                    }
                } else {
                    i5 = 13;
                    i4 = 40;
                }
            } else {
                i4 = 40;
            }
            if (i5 != 0) {
                tkc.m(thcVar);
                thcVar.h.b(fhcVar.a(str2), "Invalid public event name. Event will not be logged (FE)");
                tkc.k(yzcVar);
                yzc.y(opcVar2, null, i5, "_ev", yzc.n(i4, str2, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        xsc xscVar = tkcVar2.l;
        tkc.l(xscVar);
        dsc dscVarK = xscVar.k(false);
        if (dscVarK != null && !bundle.containsKey("_sc")) {
            dscVarK.d = true;
        }
        yzc.d0(dscVarK, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zL = yzc.L(str2);
        if (z) {
            opcVar = opcVar2;
            if (this.d != null && !zL) {
                if (!zEquals) {
                    tkc.m(thcVar);
                    thcVar.m.c(fhcVar.a(str2), fhcVar.e(bundle), "Passing event to registered event handler (FE)");
                    a78.g(this.d);
                    yyc yycVar = this.d;
                    yycVar.getClass();
                    try {
                        yycVar.a.l(str, str2, bundle, j);
                        return;
                    } catch (RemoteException e2) {
                        tkc tkcVar3 = yycVar.b.b;
                        if (tkcVar3 != null) {
                            thc thcVar2 = tkcVar3.f;
                            tkc.m(thcVar2);
                            thcVar2.i.b(e2, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
                z4 = true;
            }
            if (tkcVar2.h()) {
                tkc.k(yzcVar);
                tkcVar = yzcVar.a;
                iO0 = yzcVar.o0(str2);
                if (iO0 != 0) {
                    tkc.m(thcVar);
                    thcVar.h.b(fhcVar.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String strN = yzc.n(40, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    tkc.k(yzcVar);
                    yzc.y(opcVar, null, iO0, "_ev", strN, length);
                    return;
                }
                z5 = z4;
                bundleQ = yzcVar.q(str2, bundle, nh1.a("_o", "_sn", "_sc", "_si"), z3);
                a78.g(bundleQ);
                tkc.l(xscVar);
                if (xscVar.k(false) == null && "_ae".equals(str2)) {
                    tkc.l(cxcVar);
                    zwc zwcVar = cxcVar.f;
                    j3 = 0;
                    zwcVar.d.a.k.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j7 = jElapsedRealtime - zwcVar.b;
                    zwcVar.b = jElapsedRealtime;
                    if (j7 > 0) {
                        yzcVar.T(bundleQ, j7);
                    }
                } else {
                    j3 = 0;
                }
                if ("auto".equals(str) && "_ssr".equals(str2)) {
                    String string2 = bundleQ.getString("_ffr");
                    int i6 = q2a.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    zic zicVar3 = r16.e;
                    tkc.k(zicVar3);
                    if (Objects.equals(string2, zicVar3.v.a())) {
                        thc thcVar3 = r16.f;
                        tkc.m(thcVar3);
                        thcVar3.m.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        zic zicVar4 = tkcVar.e;
                        tkc.k(zicVar4);
                        zicVar4.v.b(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    zic zicVar5 = tkcVar.e;
                    tkc.k(zicVar5);
                    strA = zicVar5.v.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleQ.putString("_ffr", strA);
                    }
                }
                arrayList = new ArrayList();
                arrayList.add(bundleQ);
                if (t7cVar.r(null, wfc.S0)) {
                    tkc.l(cxcVar);
                    cxcVar.g();
                    zA = cxcVar.d;
                } else {
                    tkc.k(zicVar);
                    zA = zicVar.s.a();
                }
                tkc.k(zicVar);
                if (zicVar.p.a() <= j3 && zicVar.p(j) && zA) {
                    tkc.m(thcVar);
                    thcVar.n.a("Current session is expired, remove the session number, ID, and engagement time");
                    mq2Var.getClass();
                    j4 = j3;
                    i = 0;
                    r(System.currentTimeMillis(), null, "auto", "_sid");
                    r(System.currentTimeMillis(), null, "auto", "_sno");
                    r(System.currentTimeMillis(), null, "auto", "_se");
                    zicVar.q.b(j4);
                } else {
                    j4 = j3;
                    i = 0;
                }
                if (bundleQ.getLong("extend_session", j4) == 1) {
                    tkc.m(thcVar);
                    thcVar.n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    tkc.l(cxcVar);
                    j5 = j;
                    j6 = j2;
                    cxcVar.e.b(j5, j6);
                } else {
                    j5 = j;
                    j6 = j2;
                }
                arrayList2 = new ArrayList(bundleQ.keySet());
                Collections.sort(arrayList2);
                size = arrayList2.size();
                i2 = i;
                while (i2 < size) {
                    str5 = (String) arrayList2.get(i2);
                    if (str5 != null) {
                        tkc.k(yzcVar);
                        obj = bundleQ.get(str5);
                        if (obj instanceof Bundle) {
                            arrayList3 = arrayList2;
                            bundleArr = new Bundle[1];
                            bundleArr[i] = (Bundle) obj;
                        } else {
                            arrayList3 = arrayList2;
                            if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr = null;
                            }
                        }
                        if (bundleArr != null) {
                            bundleQ.putParcelableArray(str5, bundleArr);
                        }
                    } else {
                        arrayList3 = arrayList2;
                    }
                    i2++;
                    arrayList2 = arrayList3;
                }
                i3 = i;
                while (i3 < arrayList.size()) {
                    bundleN = (Bundle) arrayList.get(i3);
                    if (i3 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    bundleN.putString("_o", str);
                    if (z2) {
                        bundleN = yzcVar.N(bundleN);
                    }
                    bundle2 = bundleN;
                    z9c z9cVar = new z9c(str4, new v9c(bundle2), str, j5, j6);
                    tvc tvcVarP = tkcVar2.p();
                    tvcVarP.getClass();
                    tvcVarP.g();
                    tvcVarP.h();
                    tvcVarP.s();
                    chcVarO = tvcVarP.a.o();
                    chcVarO.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    bac.a(z9cVar, parcelObtain, i);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        thc thcVar4 = chcVarO.a.f;
                        tkc.m(thcVar4);
                        thcVar4.g.a("Event is too long for local database. Sending event directly to service");
                        zN = false;
                    } else {
                        zN = chcVarO.n(bArrMarshall, 0);
                    }
                    tvcVarP.u(new euc(tvcVarP, tvcVarP.w(true), zN, z9cVar));
                    if (!z5) {
                        it = this.e.iterator();
                        while (it.hasNext()) {
                            ((tnc) it.next()).a(str, str2, new Bundle(bundle2), j);
                        }
                    }
                    i3++;
                    j5 = j;
                    j6 = j2;
                    i = 0;
                }
                tkc.l(r11);
                if (xscVar.k(false) == null && "_ae".equals(str2)) {
                    tkc.l(cxcVar);
                    mq2Var.getClass();
                    cxcVar.f.a(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
            }
            return;
        }
        opcVar = opcVar2;
        z4 = zEquals;
        if (tkcVar2.h()) {
            return;
        }
        tkc.k(yzcVar);
        tkcVar = yzcVar.a;
        iO0 = yzcVar.o0(str2);
        if (iO0 != 0) {
            tkc.m(thcVar);
            thcVar.h.b(fhcVar.a(str2), "Invalid event name. Event will not be logged (FE)");
            String strN2 = yzc.n(40, str2, true);
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            tkc.k(yzcVar);
            yzc.y(opcVar, null, iO0, "_ev", strN2, length);
            return;
        }
        z5 = z4;
        bundleQ = yzcVar.q(str2, bundle, nh1.a("_o", "_sn", "_sc", "_si"), z3);
        a78.g(bundleQ);
        tkc.l(xscVar);
        if (xscVar.k(false) == null) {
            j3 = 0;
        } else {
            j3 = 0;
        }
        if ("auto".equals(str)) {
            if ("_ae".equals(str2)) {
                zic zicVar6 = tkcVar.e;
                tkc.k(zicVar6);
                strA = zicVar6.v.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleQ.putString("_ffr", strA);
                }
            }
        } else if ("_ae".equals(str2)) {
            zic zicVar7 = tkcVar.e;
            tkc.k(zicVar7);
            strA = zicVar7.v.a();
            if (!TextUtils.isEmpty(strA)) {
                bundleQ.putString("_ffr", strA);
            }
        }
        arrayList = new ArrayList();
        arrayList.add(bundleQ);
        if (t7cVar.r(null, wfc.S0)) {
            tkc.l(cxcVar);
            cxcVar.g();
            zA = cxcVar.d;
        } else {
            tkc.k(zicVar);
            zA = zicVar.s.a();
        }
        tkc.k(zicVar);
        if (zicVar.p.a() <= j3) {
            j4 = j3;
            i = 0;
        } else {
            j4 = j3;
            i = 0;
        }
        if (bundleQ.getLong("extend_session", j4) == 1) {
            tkc.m(thcVar);
            thcVar.n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            tkc.l(cxcVar);
            j5 = j;
            j6 = j2;
            cxcVar.e.b(j5, j6);
        } else {
            j5 = j;
            j6 = j2;
        }
        arrayList2 = new ArrayList(bundleQ.keySet());
        Collections.sort(arrayList2);
        size = arrayList2.size();
        i2 = i;
        while (i2 < size) {
            str5 = (String) arrayList2.get(i2);
            if (str5 != null) {
                tkc.k(yzcVar);
                obj = bundleQ.get(str5);
                if (obj instanceof Bundle) {
                    arrayList3 = arrayList2;
                    bundleArr = new Bundle[1];
                    bundleArr[i] = (Bundle) obj;
                } else {
                    arrayList3 = arrayList2;
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList5 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList5.toArray(new Bundle[arrayList5.size()]);
                    } else {
                        bundleArr = null;
                    }
                }
                if (bundleArr != null) {
                    bundleQ.putParcelableArray(str5, bundleArr);
                }
            } else {
                arrayList3 = arrayList2;
            }
            i2++;
            arrayList2 = arrayList3;
        }
        i3 = i;
        while (i3 < arrayList.size()) {
            bundleN = (Bundle) arrayList.get(i3);
            if (i3 != 0) {
                str4 = "_ep";
            } else {
                str4 = str2;
            }
            bundleN.putString("_o", str);
            if (z2) {
                bundleN = yzcVar.N(bundleN);
            }
            bundle2 = bundleN;
            z9c z9cVar2 = new z9c(str4, new v9c(bundle2), str, j5, j6);
            tvc tvcVarP2 = tkcVar2.p();
            tvcVarP2.getClass();
            tvcVarP2.g();
            tvcVarP2.h();
            tvcVarP2.s();
            chcVarO = tvcVarP2.a.o();
            chcVarO.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            bac.a(z9cVar2, parcelObtain2, i);
            bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            if (bArrMarshall.length > 131072) {
                thc thcVar5 = chcVarO.a.f;
                tkc.m(thcVar5);
                thcVar5.g.a("Event is too long for local database. Sending event directly to service");
                zN = false;
            } else {
                zN = chcVarO.n(bArrMarshall, 0);
            }
            tvcVarP2.u(new euc(tvcVarP2, tvcVarP2.w(true), zN, z9cVar2));
            if (!z5) {
                it = this.e.iterator();
                while (it.hasNext()) {
                    ((tnc) it.next()).a(str, str2, new Bundle(bundle2), j);
                }
            }
            i3++;
            j5 = j;
            j6 = j2;
            i = 0;
        }
        tkc.l(r11);
        if (xscVar.k(false) == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void q(String str, String str2, Object obj, boolean z, long j) {
        int iQ0;
        int length;
        tkc tkcVar = this.a;
        if (z) {
            yzc yzcVar = tkcVar.i;
            tkc.k(yzcVar);
            iQ0 = yzcVar.q0(str2);
        } else {
            yzc yzcVar2 = tkcVar.i;
            tkc.k(yzcVar2);
            if (!yzcVar2.k0("user property", str2)) {
                iQ0 = 6;
            } else if (yzcVar2.m0("user property", bw5.b, null, str2)) {
                yzcVar2.a.getClass();
                if (yzcVar2.n0(24, "user property", str2)) {
                    iQ0 = 0;
                } else {
                    iQ0 = 6;
                }
            } else {
                iQ0 = 15;
            }
        }
        opc opcVar = this.v;
        if (iQ0 != 0) {
            tkc.k(tkcVar.i);
            String strN = yzc.n(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            tkc.k(tkcVar.i);
            yzc.y(opcVar, null, iQ0, "_ev", strN, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            String str4 = str3;
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new zoc(this, str4, str2, null, j));
            return;
        }
        yzc yzcVar3 = tkcVar.i;
        yzc yzcVar4 = tkcVar.i;
        tkc.k(yzcVar3);
        int iV = yzcVar3.v(obj, str2);
        if (iV != 0) {
            tkc.k(yzcVar4);
            String strN2 = yzc.n(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            tkc.k(yzcVar4);
            yzc.y(opcVar, null, iV, "_ev", strN2, length);
            return;
        }
        tkc.k(yzcVar4);
        Object objW = yzcVar4.w(obj, str2);
        if (objW != null) {
            fkc fkcVar2 = tkcVar.g;
            tkc.m(fkcVar2);
            fkcVar2.p(new zoc(this, str3, str2, objW, j));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final void r(long j, Object obj, String str, String str2) {
        boolean zN;
        a78.d(str);
        a78.d(str2);
        g();
        h();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        tkc tkcVar = this.a;
        if (zEquals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj = Long.valueOf(j2);
                    zic zicVar = tkcVar.e;
                    tkc.k(zicVar);
                    zicVar.m.b(j2 == 1 ? "true" : "false");
                } else if (obj == null) {
                    zic zicVar2 = tkcVar.e;
                    tkc.k(zicVar2);
                    zicVar2.m.b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                zic zicVar3 = tkcVar.e;
                tkc.k(zicVar3);
                zicVar3.m.b("unset");
                str2 = "_npa";
            }
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.c("non_personalized_ads(_npa)", obj, "Setting user property(FE)");
        }
        Object obj2 = obj;
        String str4 = str2;
        if (!tkcVar.d()) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.n.a("User property not set since app measurement is disabled");
            return;
        }
        if (tkcVar.h()) {
            szc szcVar = new szc(j, obj2, str4, str);
            tvc tvcVarP = tkcVar.p();
            tvcVarP.g();
            tvcVarP.h();
            tvcVarP.s();
            chc chcVarO = tvcVarP.a.o();
            chcVarO.getClass();
            Parcel parcelObtain = Parcel.obtain();
            uzc.a(szcVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                thc thcVar3 = chcVarO.a.f;
                tkc.m(thcVar3);
                thcVar3.g.a("User property too long for local database. Sending directly to service");
                zN = false;
            } else {
                zN = chcVarO.n(bArrMarshall, 1);
            }
            tvcVarP.u(new gtc(tvcVarP, tvcVarP.w(true), zN, szcVar));
        }
    }

    public final void s() {
        g();
        h();
        tkc tkcVar = this.a;
        if (tkcVar.h()) {
            t7c t7cVar = tkcVar.d;
            t7cVar.a.getClass();
            Boolean boolT = t7cVar.t("google_analytics_deferred_deep_link_enabled");
            if (boolT != null && boolT.booleanValue()) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.m.a("Deferred Deep Link feature enabled.");
                fkc fkcVar = tkcVar.g;
                tkc.m(fkcVar);
                fkcVar.p(new Runnable() { // from class: drc
                    @Override // java.lang.Runnable
                    public final void run() {
                        hrc hrcVar = this.t;
                        hrcVar.g();
                        tkc tkcVar2 = hrcVar.a;
                        zic zicVar = tkcVar2.e;
                        thc thcVar2 = tkcVar2.f;
                        tkc.k(zicVar);
                        pic picVar = zicVar.t;
                        if (picVar.a()) {
                            tkc.m(thcVar2);
                            thcVar2.m.a("Deferred Deep Link already retrieved. Not fetching again.");
                            return;
                        }
                        tic ticVar = zicVar.u;
                        long jA = ticVar.a();
                        ticVar.b(1 + jA);
                        if (jA >= 5) {
                            tkc.m(thcVar2);
                            thcVar2.i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            picVar.b(true);
                        } else {
                            if (hrcVar.s == null) {
                                hrcVar.s = new dpc(hrcVar, tkcVar2);
                            }
                            hrcVar.s.b(0L);
                        }
                    }
                });
            }
            tvc tvcVarP = tkcVar.p();
            tvcVarP.g();
            tvcVarP.h();
            q1d q1dVarW = tvcVarP.w(true);
            tvcVarP.s();
            tkc tkcVar2 = tvcVarP.a;
            tkcVar2.d.r(null, wfc.W0);
            tkcVar2.o().n(new byte[0], 3);
            tvcVarP.u(new ntc(tvcVarP, q1dVarW));
            this.r = false;
            zic zicVar = tkcVar.e;
            tkc.k(zicVar);
            zicVar.g();
            String string = zicVar.k().getString("previous_os_version", null);
            zicVar.a.q().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zicVar.k().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            tkcVar.q().i();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            n("auto", "_ou", bundle);
        }
    }

    public final void t(Bundle bundle, long j) {
        a78.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        tkc tkcVar = this.a;
        if (!zIsEmpty) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        uma.d(bundle2, "app_id", String.class, null);
        uma.d(bundle2, "origin", String.class, null);
        uma.d(bundle2, "name", String.class, null);
        uma.d(bundle2, "value", Object.class, null);
        uma.d(bundle2, "trigger_event_name", String.class, null);
        uma.d(bundle2, "trigger_timeout", Long.class, 0L);
        uma.d(bundle2, "timed_out_event_name", String.class, null);
        uma.d(bundle2, "timed_out_event_params", Bundle.class, null);
        uma.d(bundle2, "triggered_event_name", String.class, null);
        uma.d(bundle2, "triggered_event_params", Bundle.class, null);
        uma.d(bundle2, "time_to_live", Long.class, 0L);
        uma.d(bundle2, "expired_event_name", String.class, null);
        uma.d(bundle2, "expired_event_params", Bundle.class, null);
        a78.d(bundle2.getString("name"));
        a78.d(bundle2.getString("origin"));
        a78.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        yzc yzcVar = tkcVar.i;
        fhc fhcVar = tkcVar.j;
        thc thcVar2 = tkcVar.f;
        tkc.k(yzcVar);
        if (yzcVar.q0(string) != 0) {
            tkc.m(thcVar2);
            thcVar2.f.b(fhcVar.c(string), "Invalid conditional user property name");
            return;
        }
        tkc.k(yzcVar);
        if (yzcVar.v(obj, string) != 0) {
            tkc.m(thcVar2);
            thcVar2.f.c(fhcVar.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objW = yzcVar.w(obj, string);
        if (objW == null) {
            tkc.m(thcVar2);
            thcVar2.f.c(fhcVar.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        uma.c(bundle2, objW);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            tkc.m(thcVar2);
            thcVar2.f.c(fhcVar.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            tkc.m(thcVar2);
            thcVar2.f.c(fhcVar.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new gpc(this, bundle2));
        }
    }

    public final void u(String str, String str2, Bundle bundle) {
        tkc tkcVar = this.a;
        tkcVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a78.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.p(new hpc(this, bundle2));
    }

    public final String v() {
        tkc tkcVar = this.a;
        try {
            return s7.d(tkcVar.a, tkcVar.p);
        } catch (IllegalStateException e) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void w(nnc nncVar, long j, boolean z) {
        int i = nncVar.b;
        g();
        h();
        tkc tkcVar = this.a;
        zic zicVar = tkcVar.e;
        thc thcVar = tkcVar.f;
        tkc.k(zicVar);
        nnc nncVarN = zicVar.n();
        if (j <= this.p && nnc.l(nncVarN.b, i)) {
            tkc.m(thcVar);
            thcVar.l.b(nncVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        zic zicVar2 = tkcVar.e;
        tkc.k(zicVar2);
        zicVar2.g();
        if (!nnc.l(i, zicVar2.k().getInt("consent_source", 100))) {
            tkc.m(thcVar);
            thcVar.l.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = zicVar2.k().edit();
        editorEdit.putString("consent_settings", nncVar.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        tkc.m(thcVar);
        thcVar.n.b(nncVar, "Setting storage consent(FE)");
        this.p = j;
        if (tkcVar.p().q()) {
            final tvc tvcVarP = tkcVar.p();
            tvcVarP.g();
            tvcVarP.h();
            tvcVarP.u(new Runnable() { // from class: rvc
                @Override // java.lang.Runnable
                public final void run() {
                    tvc tvcVar = tvcVarP;
                    tkc tkcVar2 = tvcVar.a;
                    jgc jgcVar = tvcVar.d;
                    if (jgcVar == null) {
                        thc thcVar2 = tkcVar2.f;
                        tkc.m(thcVar2);
                        thcVar2.f.a("Failed to send storage consent settings to service");
                        return;
                    }
                    try {
                        jgcVar.m(tvcVar.w(false));
                        tvcVar.t();
                    } catch (RemoteException e) {
                        thc thcVar3 = tkcVar2.f;
                        tkc.m(thcVar3);
                        thcVar3.f.b(e, "Failed to send storage consent settings to the service");
                    }
                }
            });
        } else {
            tvc tvcVarP2 = tkcVar.p();
            tvcVarP2.g();
            tvcVarP2.h();
            if (tvcVarP2.p()) {
                tvcVarP2.u(new cuc(tvcVarP2, tvcVarP2.w(false)));
            }
        }
        if (z) {
            tkcVar.p().k(new AtomicReference());
        }
    }

    public final void x(Boolean bool, boolean z) {
        g();
        h();
        tkc tkcVar = this.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.b(bool, "Setting app measurement enabled (FE)");
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        zicVar.g();
        SharedPreferences.Editor editorEdit = zicVar.k().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            zicVar.g();
            SharedPreferences.Editor editorEdit2 = zicVar.k().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.g();
        if (tkcVar.z || !(bool == null || bool.booleanValue())) {
            y();
        }
    }

    public final void y() {
        g();
        tkc tkcVar = this.a;
        zic zicVar = tkcVar.e;
        thc thcVar = tkcVar.f;
        mq2 mq2Var = tkcVar.k;
        tkc.k(zicVar);
        String strA = zicVar.m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                mq2Var.getClass();
                r(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strA) ? 0L : 1L);
                mq2Var.getClass();
                r(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!tkcVar.d() || !this.r) {
            tkc.m(thcVar);
            thcVar.m.a("Updating Scion state (FE)");
            tvc tvcVarP = tkcVar.p();
            tvcVarP.g();
            tvcVarP.h();
            tvcVarP.u(new auc(tvcVarP, tvcVarP.w(true)));
            return;
        }
        tkc.m(thcVar);
        thcVar.m.a("Recording app launch after enabling measurement for the first time (FE)");
        s();
        cxc cxcVar = tkcVar.h;
        tkc.l(cxcVar);
        cxcVar.e.a();
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.p(new loc(this));
    }

    public final void z() {
        tkc tkcVar = this.a;
        if (!(tkcVar.a.getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) tkcVar.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }
}
