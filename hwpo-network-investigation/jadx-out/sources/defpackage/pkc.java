package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pkc implements Runnable {
    public final /* synthetic */ xnc t;
    public final /* synthetic */ tkc u;

    public pkc(tkc tkcVar, xnc xncVar) {
        this.t = xncVar;
        this.u = tkcVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a3 A[Catch: NotFoundException -> 0x02a8, TRY_LEAVE, TryCatch #1 {NotFoundException -> 0x02a8, blocks: (B:100:0x0291, B:103:0x02a3), top: B:288:0x0291 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e8 A[EDGE_INSN: B:118:0x02e8->B:119:0x02ea BREAK  A[LOOP:0: B:113:0x02ce->B:302:?]] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:124:0x030e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0354  */
    /* JADX WARN: Code duplicated, block: B:127:0x035d  */
    /* JADX WARN: Code duplicated, block: B:130:0x037f  */
    /* JADX WARN: Code duplicated, block: B:133:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x03be  */
    /* JADX WARN: Code duplicated, block: B:137:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d2 A[PHI: r12
      0x03d2: PHI (r12v14 boolean) = (r12v10 boolean), (r12v9 boolean) binds: [B:141:0x03d1, B:138:0x03cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0401  */
    /* JADX WARN: Code duplicated, block: B:145:0x0419  */
    /* JADX WARN: Code duplicated, block: B:148:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0442  */
    /* JADX WARN: Code duplicated, block: B:153:0x0464  */
    /* JADX WARN: Code duplicated, block: B:154:0x0478 A[PHI: r26 r27 r28
      0x0478: PHI (r26v2 tkc) = (r26v0 tkc), (r26v3 tkc) binds: [B:152:0x0462, B:150:0x0445] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r27v2 phc) = (r27v0 phc), (r27v3 phc) binds: [B:152:0x0462, B:150:0x0445] A[DONT_GENERATE, DONT_INLINE]
      0x0478: PHI (r28v2 yzc) = (r28v0 yzc), (r28v3 yzc) binds: [B:152:0x0462, B:150:0x0445] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0495  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:169:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:172:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:175:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:178:0x0507  */
    /* JADX WARN: Code duplicated, block: B:180:0x0515 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0532  */
    /* JADX WARN: Code duplicated, block: B:188:0x0538  */
    /* JADX WARN: Code duplicated, block: B:190:0x0556  */
    /* JADX WARN: Code duplicated, block: B:194:0x0584  */
    /* JADX WARN: Code duplicated, block: B:197:0x059e  */
    /* JADX WARN: Code duplicated, block: B:202:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:204:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:206:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:207:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:210:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:217:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:220:0x060c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0620  */
    /* JADX WARN: Code duplicated, block: B:224:0x0625  */
    /* JADX WARN: Code duplicated, block: B:226:0x0637  */
    /* JADX WARN: Code duplicated, block: B:228:0x0657 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:241:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:244:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:253:0x073f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0747  */
    /* JADX WARN: Code duplicated, block: B:256:0x0749  */
    /* JADX WARN: Code duplicated, block: B:258:0x0751  */
    /* JADX WARN: Code duplicated, block: B:262:0x075e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0793  */
    /* JADX WARN: Code duplicated, block: B:268:0x079e  */
    /* JADX WARN: Code duplicated, block: B:270:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:273:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:277:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:288:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0167 A[Catch: NameNotFoundException -> 0x0186, TryCatch #3 {NameNotFoundException -> 0x0186, blocks: (B:41:0x015c, B:43:0x0167, B:45:0x0173), top: B:292:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0173 A[Catch: NameNotFoundException -> 0x0186, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x0186, blocks: (B:41:0x015c, B:43:0x0167, B:45:0x0173), top: B:292:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:75:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x022e  */
    /* JADX WARN: Code duplicated, block: B:80:0x022f A[Catch: IllegalStateException -> 0x0251, TryCatch #2 {IllegalStateException -> 0x0251, blocks: (B:77:0x0226, B:81:0x0235, B:85:0x023d, B:87:0x0241, B:80:0x022f), top: B:290:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x023b  */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0241 A[Catch: IllegalStateException -> 0x0251, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0251, blocks: (B:77:0x0226, B:81:0x0235, B:85:0x023d, B:87:0x0241, B:80:0x022f), top: B:290:0x0226 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0272  */
    /* JADX WARN: Code duplicated, block: B:95:0x0280  */
    /* JADX WARN: Code duplicated, block: B:98:0x0287  */
    /* JADX WARN: Type inference failed for: r0v50, types: [xqc] */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        String str;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int i;
        String str2;
        int iG;
        tkc tkcVar;
        Bundle bundleS;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        wrc wrcVar;
        phc phcVar;
        phc phcVar2;
        phc phcVar3;
        phc phcVar4;
        String strM;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final hrc hrcVar;
        int iL;
        boolean zR;
        boolean z;
        thc thcVar;
        xic xicVar;
        nnc nncVarN;
        hnc hncVarW;
        hnc hncVarW2;
        lnc lncVar;
        hnc hncVar;
        tkc tkcVar2;
        phc phcVar5;
        yzc yzcVar;
        nnc nncVar;
        boolean z2;
        tkc tkcVar3;
        hnc hncVarW3;
        hnc hncVarW4;
        Boolean boolT;
        tic ticVar;
        s7d s7dVar;
        tkc tkcVar4;
        yzc yzcVar2;
        xic xicVar2;
        thc thcVar2;
        boolean zD;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        phc phcVar6;
        Context context;
        boolean z3;
        Iterator it;
        String str3;
        yzc yzcVar3;
        String strD;
        Bundle bundle;
        tkc tkcVar5 = this.u;
        fkc fkcVar = tkcVar5.g;
        thc thcVar3 = tkcVar5.f;
        zic zicVar = tkcVar5.e;
        yzc yzcVar4 = tkcVar5.i;
        tkc.m(fkcVar);
        fkcVar.g();
        t7c t7cVar = tkcVar5.d;
        t7cVar.a.getClass();
        n9c n9cVar = new n9c(tkcVar5);
        n9cVar.j();
        tkcVar5.s = n9cVar;
        xnc xncVar = this.t;
        jcc jccVar = xncVar.d;
        long j2 = jccVar == null ? 0L : jccVar.t;
        String str4 = BuildConfig.FLAVOR;
        wgc wgcVar = new wgc(tkcVar5, xncVar.c, j2, (jccVar == null || (bundle = jccVar.w) == null) ? BuildConfig.FLAVOR : bundle.getString("runtime_google_app_id", BuildConfig.FLAVOR));
        wgcVar.i();
        tkcVar5.t = wgcVar;
        chc chcVar = new chc(tkcVar5);
        chcVar.i();
        tkcVar5.q = chcVar;
        tvc tvcVar = new tvc(tkcVar5);
        tvcVar.i();
        tkcVar5.r = tvcVar;
        boolean z4 = yzcVar4.b;
        tkc tkcVar6 = yzcVar4.a;
        if (z4) {
            aa0.c("Can't initialize twice");
            return;
        }
        yzcVar4.g();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                thc thcVar4 = yzcVar4.a.f;
                tkc.m(thcVar4);
                thcVar4.i.a("Utils falling back to Random for random id");
            }
        }
        yzcVar4.d.set(jNextLong);
        tkcVar6.C.incrementAndGet();
        yzcVar4.b = true;
        if (zicVar.b) {
            aa0.c("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = zicVar.a.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        zicVar.c = sharedPreferences2;
        boolean z5 = sharedPreferences2.getBoolean("has_been_opened", false);
        zicVar.r = z5;
        if (!z5) {
            SharedPreferences.Editor editorEdit = zicVar.c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        zicVar.e = new vic(zicVar, Math.max(0L, ((Long) wfc.d.a(null)).longValue()));
        zicVar.a.C.incrementAndGet();
        zicVar.b = true;
        wgc wgcVar2 = tkcVar5.t;
        if (wgcVar2.b) {
            aa0.c("Can't initialize twice");
            return;
        }
        tkc tkcVar7 = wgcVar2.a;
        thc thcVar5 = tkcVar7.f;
        thc thcVar6 = tkcVar7.f;
        tkc.m(thcVar5);
        thcVar5.n.c(Long.valueOf(wgcVar2.j), Long.valueOf(wgcVar2.i), "sdkVersion bundled with app, dynamiteVersion");
        Context context2 = tkcVar7.a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    tkc.m(thcVar6);
                    thcVar6.f.b(thc.o(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = BuildConfig.FLAVOR;
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    wgcVar = wgcVar;
                                    str2 = installerPackageName;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str;
                                    tkc.m(thcVar6);
                                    thcVar6.f.c(thc.o(packageName), string, "Error retrieving package info. appId, appName");
                                    str = str5;
                                    str2 = installerPackageName;
                                    i = Integer.MIN_VALUE;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        wgcVar2.c = packageName;
                        wgcVar2.f = str2;
                        wgcVar2.d = str;
                        wgcVar2.e = i;
                        wgcVar2.g = string;
                        wgcVar2.h = 0L;
                        iG = tkcVar7.g();
                        if (iG == 0) {
                            tkc.m(thcVar6);
                            thcVar6.n.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            tkc.m(thcVar6);
                            thcVar6.l.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            tkc.m(thcVar6);
                            thcVar6.l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            tkc.m(thcVar6);
                            thcVar6.l.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            tkc.m(thcVar6);
                            thcVar6.k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            tkc.m(thcVar6);
                            thcVar6.l.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            tkc.m(thcVar6);
                            thcVar6.l.a("App measurement disabled");
                            tkc.m(thcVar6);
                            thcVar6.g.a("Invalid scion state in identity");
                        } else {
                            tkc.m(thcVar6);
                            thcVar6.l.a("App measurement disabled due to denied storage consent");
                        }
                        wgcVar2.o = BuildConfig.FLAVOR;
                        strD = wgcVar2.m;
                        if (TextUtils.isEmpty(strD)) {
                            strD = s7.d(context2, tkcVar7.p);
                        }
                        if (!TextUtils.isEmpty(strD)) {
                            str4 = strD;
                        }
                        wgcVar2.o = str4;
                        if (iG == 0) {
                            tkc.m(thcVar6);
                            thcVar6.n.c(wgcVar2.c, wgcVar2.o, "App measurement enabled for app package, google app id");
                        }
                        wgcVar2.k = null;
                        t7c t7cVar2 = tkcVar7.d;
                        tkcVar = t7cVar2.a;
                        a78.d("analytics.safelisted_events");
                        bundleS = t7cVar2.s();
                        if (bundleS != null) {
                            if (bundleS.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleS.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = tkcVar.a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = null;
                                    } else {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    thc thcVar7 = tkcVar.f;
                                    tkc.m(thcVar7);
                                    thcVar7.f.b(e, "Failed to load string array from metadata: resource not found");
                                }
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                wgcVar2.k = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        wgcVar2.k = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it.next();
                                        yzcVar3 = tkcVar7.i;
                                        tkc.k(yzcVar3);
                                    }
                                } while (yzcVar3.l0("safelisted event", str3));
                            } else {
                                tkc.m(thcVar6);
                                thcVar6.k.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                wgcVar2.n = ye5.a(context2) ? 1 : 0;
                            } else {
                                wgcVar2.n = 0;
                            }
                            wgcVar2.a.C.incrementAndGet();
                            wgcVar2.b = true;
                            wrcVar = new wrc(tkcVar5);
                            wrcVar.i();
                            tkcVar5.u = wrcVar;
                            if (!wrcVar.b) {
                                aa0.c("Can't initialize twice");
                                return;
                            }
                            tkc tkcVar8 = wrcVar.a;
                            wrcVar.c = (JobScheduler) tkcVar8.a.getSystemService("jobscheduler");
                            tkcVar8.C.incrementAndGet();
                            wrcVar.b = true;
                            tkc.m(thcVar3);
                            phcVar = thcVar3.m;
                            phcVar2 = thcVar3.l;
                            phcVar3 = thcVar3.n;
                            phcVar4 = thcVar3.f;
                            t7cVar.m();
                            phcVar2.b(161000L, "App measurement initialized, version");
                            tkc.m(thcVar3);
                            phcVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM = wgcVar.m();
                            if (yzcVar4.M(strM, t7cVar.c)) {
                                tkc.m(thcVar3);
                                phcVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                tkc.m(thcVar3);
                                phcVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                            }
                            tkc.m(thcVar3);
                            phcVar.a("Debug-level message logging enabled");
                            i2 = tkcVar5.A;
                            atomicInteger = tkcVar5.C;
                            if (i2 != atomicInteger.get()) {
                                tkc.m(thcVar3);
                                phcVar4.c(Integer.valueOf(tkcVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            tkcVar5.v = true;
                            j = tkcVar5.D;
                            hrcVar = tkcVar5.m;
                            fkc fkcVar2 = tkcVar5.g;
                            tkc.m(fkcVar2);
                            fkcVar2.g();
                            tkc.j(tkcVar5.u);
                            iL = tkcVar5.u.l();
                            o6c.a();
                            zR = t7cVar.r(null, wfc.P0);
                            if (iL == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zR) {
                                yzcVar4.g();
                                if (yzcVar4.E() == 1) {
                                    yzcVar4.g();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z3 = z;
                                    thcVar = thcVar3;
                                    vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter, 2);
                                    thc thcVar8 = tkcVar6.f;
                                    tkc.m(thcVar8);
                                    thcVar8.m.a("Registered app receiver");
                                    if (z3) {
                                        tkc.j(tkcVar5.u);
                                        tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    yzcVar4.g();
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z3 = z;
                                    thcVar = thcVar3;
                                    vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter2, 2);
                                    thc thcVar9 = tkcVar6.f;
                                    tkc.m(thcVar9);
                                    thcVar9.m.a("Registered app receiver");
                                    if (z3) {
                                        tkc.j(tkcVar5.u);
                                        tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                                    }
                                } else {
                                    thcVar = thcVar3;
                                }
                            } else if (z) {
                                z = true;
                                yzcVar4.g();
                                IntentFilter intentFilter3 = new IntentFilter();
                                intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z3 = z;
                                thcVar = thcVar3;
                                vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter3, 2);
                                thc thcVar10 = tkcVar6.f;
                                tkc.m(thcVar10);
                                thcVar10.m.a("Registered app receiver");
                                if (z3) {
                                    tkc.j(tkcVar5.u);
                                    tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                                }
                            } else {
                                thcVar = thcVar3;
                            }
                            xicVar = zicVar.g;
                            nncVarN = zicVar.n();
                            int i3 = nncVarN.b;
                            hncVarW = t7cVar.w("google_analytics_default_allow_ad_storage", false);
                            hncVarW2 = t7cVar.w("google_analytics_default_allow_analytics_storage", false);
                            lncVar = lnc.ANALYTICS_STORAGE;
                            hncVar = hnc.UNINITIALIZED;
                            if (hncVarW == hncVar || hncVarW2 != hncVar) {
                                tkcVar2 = tkcVar5;
                                phcVar5 = phcVar4;
                                yzcVar = yzcVar4;
                                if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(lnc.class);
                                    enumMap.put(lnc.AD_STORAGE, hncVarW);
                                    enumMap.put(lncVar, hncVarW2);
                                    nncVar = new nnc(enumMap, -10);
                                    z2 = false;
                                }
                                if (nncVar != null) {
                                    tkc.l(hrcVar);
                                    hrcVar.C(nncVar, true);
                                } else {
                                    nncVar = nncVarN;
                                }
                                tkc.l(hrcVar);
                                tkcVar3 = hrcVar.a;
                                hrcVar.G(nncVar);
                                zicVar.g();
                                int i4 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
                                hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                                if (hncVarW3 != hncVar) {
                                    tkc.m(thcVar);
                                    phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
                                }
                                hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
                                if (hncVarW4 == hncVar && nnc.l(-10, i4)) {
                                    tkc.l(hrcVar);
                                    EnumMap enumMap2 = new EnumMap(lnc.class);
                                    enumMap2.put(lnc.AD_USER_DATA, hncVarW4);
                                    hrcVar.B(new m9c(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (!TextUtils.isEmpty(tkcVar2.r().n()) && (i4 == 0 || i4 == 30)) {
                                    tkc.l(hrcVar);
                                    hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolT = t7cVar.t("google_analytics_tcf_data_enabled");
                                if (boolT != null || boolT.booleanValue()) {
                                    tkc.m(thcVar);
                                    phcVar.a("TCF client enabled.");
                                    tkc.l(hrcVar);
                                    hrcVar.g();
                                    thc thcVar11 = tkcVar3.f;
                                    tkc.m(thcVar11);
                                    thcVar11.m.a("Register tcfPrefChangeListener.");
                                    if (hrcVar.t == null) {
                                        hrcVar.u = new voc(hrcVar, tkcVar3);
                                        hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                hrc hrcVar2 = hrcVar;
                                                hrcVar2.getClass();
                                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    thc thcVar12 = hrcVar2.a.f;
                                                    tkc.m(thcVar12);
                                                    thcVar12.n.a("IABTCF_TCString change picked up in listener.");
                                                    voc vocVar = hrcVar2.u;
                                                    a78.g(vocVar);
                                                    vocVar.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    zic zicVar2 = tkcVar3.e;
                                    tkc.k(zicVar2);
                                    zicVar2.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                                    tkc.l(hrcVar);
                                    hrcVar.m();
                                }
                                ticVar = zicVar.f;
                                if (ticVar.a() == 0) {
                                    tkc.m(thcVar);
                                    phcVar3.b(Long.valueOf(j), "Persisting first open");
                                    ticVar.b(j);
                                }
                                tkc.l(hrcVar);
                                s7dVar = hrcVar.q;
                                if (s7dVar.c() && s7dVar.b()) {
                                    zic zicVar3 = s7dVar.a.e;
                                    tkc.k(zicVar3);
                                    zicVar3.w.b(null);
                                }
                                if (tkcVar2.h()) {
                                    tkcVar4 = tkcVar2;
                                    yzcVar2 = yzcVar;
                                    if (TextUtils.isEmpty(tkcVar4.r().n())) {
                                        xicVar2 = xicVar;
                                    } else {
                                        String strN = tkcVar4.r().n();
                                        zicVar.g();
                                        String string2 = zicVar.k().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strN);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            xicVar2 = xicVar;
                                        } else {
                                            a78.g(strN);
                                            if (strN.equals(string2)) {
                                                xicVar2 = xicVar;
                                            } else {
                                                tkc.m(thcVar);
                                                phcVar2.a("Rechecking which service to use due to a GMP App Id change");
                                                zicVar.g();
                                                zicVar.g();
                                                Boolean boolValueOf = zicVar.k().contains("measurement_enabled") ? Boolean.valueOf(zicVar.k().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = zicVar.k().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    zicVar.g();
                                                    SharedPreferences.Editor editorEdit3 = zicVar.k().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                tkcVar4.o().k();
                                                tkcVar4.r.o();
                                                tkcVar4.r.m();
                                                ticVar.b(j);
                                                xicVar2 = xicVar;
                                                xicVar2.b(null);
                                            }
                                        }
                                        String strN2 = tkcVar4.r().n();
                                        zicVar.g();
                                        SharedPreferences.Editor editorEdit4 = zicVar.k().edit();
                                        editorEdit4.putString("gmp_app_id", strN2);
                                        editorEdit4.apply();
                                    }
                                    if (!zicVar.n().i(lncVar)) {
                                        xicVar2.b(null);
                                    }
                                    tkc.l(hrcVar);
                                    hrcVar.g.set(xicVar2.a());
                                    try {
                                        tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        xic xicVar3 = zicVar.v;
                                        if (!TextUtils.isEmpty(xicVar3.a())) {
                                            tkc.m(thcVar);
                                            thcVar2 = thcVar;
                                            thcVar2.i.a("Remote config removed with active feature rollouts");
                                            xicVar3.b(null);
                                        }
                                        if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                                            zD = tkcVar4.d();
                                            sharedPreferences = zicVar.c;
                                            if (sharedPreferences == null) {
                                                zContains = z2;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                zicVar.o(!zD);
                                            }
                                            if (zD) {
                                                tkc.l(hrcVar);
                                                hrcVar.s();
                                            }
                                            cxc cxcVar = tkcVar4.h;
                                            tkc.l(cxcVar);
                                            cxcVar.e.a();
                                            tkcVar4.p().k(new AtomicReference());
                                            tkcVar4.p().l(zicVar.y.a());
                                        }
                                        o6c.a();
                                        if (t7cVar.r(null, wfc.P0)) {
                                            yzcVar2.g();
                                            if (yzcVar2.E() == 1) {
                                                long jIntValue = ((Integer) wfc.w0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                tkcVar4.k.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    tkc.m(thcVar2);
                                                    phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                tkc.l(hrcVar);
                                                hrcVar.g();
                                                if (hrcVar.l == null) {
                                                    hrcVar.l = new boc(hrcVar, tkcVar3);
                                                }
                                                hrcVar.l.b(jMax);
                                            }
                                        }
                                        zicVar.o.b(true);
                                    }
                                    thcVar2 = thcVar;
                                    if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                                        zD = tkcVar4.d();
                                        sharedPreferences = zicVar.c;
                                        if (sharedPreferences == null) {
                                            zContains = z2;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !t7cVar.u()) {
                                            zicVar.o(!zD);
                                        }
                                        if (zD) {
                                            tkc.l(hrcVar);
                                            hrcVar.s();
                                        }
                                        cxc cxcVar2 = tkcVar4.h;
                                        tkc.l(cxcVar2);
                                        cxcVar2.e.a();
                                        tkcVar4.p().k(new AtomicReference());
                                        tkcVar4.p().l(zicVar.y.a());
                                    }
                                } else {
                                    if (tkcVar2.d()) {
                                        yzcVar2 = yzcVar;
                                        if (yzcVar2.K("android.permission.INTERNET")) {
                                            phcVar6 = phcVar5;
                                        } else {
                                            tkc.m(thcVar);
                                            phcVar6 = phcVar5;
                                            phcVar6.a("App is missing INTERNET permission");
                                        }
                                        if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                            tkc.m(thcVar);
                                            phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        tkcVar4 = tkcVar2;
                                        context = tkcVar4.a;
                                        if (!wqb.a(context).c() && !t7cVar.j()) {
                                            if (!yzc.c0(context)) {
                                                tkc.m(thcVar);
                                                phcVar6.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!yzc.B(context)) {
                                                tkc.m(thcVar);
                                                phcVar6.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        tkc.m(thcVar);
                                        phcVar6.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        tkcVar4 = tkcVar2;
                                        yzcVar2 = yzcVar;
                                    }
                                    thcVar2 = thcVar;
                                }
                                o6c.a();
                                if (t7cVar.r(null, wfc.P0)) {
                                    yzcVar2.g();
                                    if (yzcVar2.E() == 1) {
                                        long jIntValue2 = ((Integer) wfc.w0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        tkcVar4.k.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            tkc.m(thcVar2);
                                            phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        tkc.l(hrcVar);
                                        hrcVar.g();
                                        if (hrcVar.l == null) {
                                            hrcVar.l = new boc(hrcVar, tkcVar3);
                                        }
                                        hrcVar.l.b(jMax);
                                    }
                                }
                                zicVar.o.b(true);
                            }
                            tkcVar2 = tkcVar5;
                            phcVar5 = phcVar4;
                            yzcVar = yzcVar4;
                            if (TextUtils.isEmpty(tkcVar2.r().n()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                                tkc.l(hrcVar);
                                z2 = false;
                                hrcVar.C(new nnc(-10), false);
                            } else {
                                z2 = false;
                            }
                            nncVar = null;
                            if (nncVar != null) {
                                tkc.l(hrcVar);
                                hrcVar.C(nncVar, true);
                            } else {
                                nncVar = nncVarN;
                            }
                            tkc.l(hrcVar);
                            tkcVar3 = hrcVar.a;
                            hrcVar.G(nncVar);
                            zicVar.g();
                            int i5 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
                            hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                            if (hncVarW3 != hncVar) {
                                tkc.m(thcVar);
                                phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
                            }
                            hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
                            if (hncVarW4 == hncVar) {
                                if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                                    tkc.l(hrcVar);
                                    hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                                tkc.l(hrcVar);
                                hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolT = t7cVar.t("google_analytics_tcf_data_enabled");
                            if (boolT != null) {
                                tkc.m(thcVar);
                                phcVar.a("TCF client enabled.");
                                tkc.l(hrcVar);
                                hrcVar.g();
                                thc thcVar12 = tkcVar3.f;
                                tkc.m(thcVar12);
                                thcVar12.m.a("Register tcfPrefChangeListener.");
                                if (hrcVar.t == null) {
                                    hrcVar.u = new voc(hrcVar, tkcVar3);
                                    hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                            hrc hrcVar2 = hrcVar;
                                            hrcVar2.getClass();
                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                thc thcVar13 = hrcVar2.a.f;
                                                tkc.m(thcVar13);
                                                thcVar13.n.a("IABTCF_TCString change picked up in listener.");
                                                voc vocVar = hrcVar2.u;
                                                a78.g(vocVar);
                                                vocVar.b(500L);
                                            }
                                        }
                                    };
                                }
                                zic zicVar4 = tkcVar3.e;
                                tkc.k(zicVar4);
                                zicVar4.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                                tkc.l(hrcVar);
                                hrcVar.m();
                            } else {
                                tkc.m(thcVar);
                                phcVar.a("TCF client enabled.");
                                tkc.l(hrcVar);
                                hrcVar.g();
                                thc thcVar13 = tkcVar3.f;
                                tkc.m(thcVar13);
                                thcVar13.m.a("Register tcfPrefChangeListener.");
                                if (hrcVar.t == null) {
                                    hrcVar.u = new voc(hrcVar, tkcVar3);
                                    hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                            hrc hrcVar2 = hrcVar;
                                            hrcVar2.getClass();
                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                thc thcVar14 = hrcVar2.a.f;
                                                tkc.m(thcVar14);
                                                thcVar14.n.a("IABTCF_TCString change picked up in listener.");
                                                voc vocVar = hrcVar2.u;
                                                a78.g(vocVar);
                                                vocVar.b(500L);
                                            }
                                        }
                                    };
                                }
                                zic zicVar5 = tkcVar3.e;
                                tkc.k(zicVar5);
                                zicVar5.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                                tkc.l(hrcVar);
                                hrcVar.m();
                            }
                            ticVar = zicVar.f;
                            if (ticVar.a() == 0) {
                                tkc.m(thcVar);
                                phcVar3.b(Long.valueOf(j), "Persisting first open");
                                ticVar.b(j);
                            }
                            tkc.l(hrcVar);
                            s7dVar = hrcVar.q;
                            if (s7dVar.c()) {
                                zic zicVar6 = s7dVar.a.e;
                                tkc.k(zicVar6);
                                zicVar6.w.b(null);
                            }
                            if (tkcVar2.h()) {
                                if (tkcVar2.d()) {
                                    yzcVar2 = yzcVar;
                                    if (yzcVar2.K("android.permission.INTERNET")) {
                                        tkc.m(thcVar);
                                        phcVar6 = phcVar5;
                                        phcVar6.a("App is missing INTERNET permission");
                                    } else {
                                        phcVar6 = phcVar5;
                                    }
                                    if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                        tkc.m(thcVar);
                                        phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    tkcVar4 = tkcVar2;
                                    context = tkcVar4.a;
                                    if (!wqb.a(context).c()) {
                                        if (!yzc.c0(context)) {
                                            tkc.m(thcVar);
                                            phcVar6.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!yzc.B(context)) {
                                            tkc.m(thcVar);
                                            phcVar6.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    tkc.m(thcVar);
                                    phcVar6.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    tkcVar4 = tkcVar2;
                                    yzcVar2 = yzcVar;
                                }
                                thcVar2 = thcVar;
                            } else {
                                tkcVar4 = tkcVar2;
                                yzcVar2 = yzcVar;
                                if (TextUtils.isEmpty(tkcVar4.r().n())) {
                                    String strN3 = tkcVar4.r().n();
                                    zicVar.g();
                                    String string3 = zicVar.k().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strN3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                    if (zIsEmpty) {
                                        xicVar2 = xicVar;
                                    } else {
                                        xicVar2 = xicVar;
                                    }
                                    String strN4 = tkcVar4.r().n();
                                    zicVar.g();
                                    SharedPreferences.Editor editorEdit5 = zicVar.k().edit();
                                    editorEdit5.putString("gmp_app_id", strN4);
                                    editorEdit5.apply();
                                } else {
                                    xicVar2 = xicVar;
                                }
                                if (!zicVar.n().i(lncVar)) {
                                    xicVar2.b(null);
                                }
                                tkc.l(hrcVar);
                                hrcVar.g.set(xicVar2.a());
                                tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                thcVar2 = thcVar;
                                if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                                    zD = tkcVar4.d();
                                    sharedPreferences = zicVar.c;
                                    if (sharedPreferences == null) {
                                        zContains = z2;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        zicVar.o(!zD);
                                    }
                                    if (zD) {
                                        tkc.l(hrcVar);
                                        hrcVar.s();
                                    }
                                    cxc cxcVar3 = tkcVar4.h;
                                    tkc.l(cxcVar3);
                                    cxcVar3.e.a();
                                    tkcVar4.p().k(new AtomicReference());
                                    tkcVar4.p().l(zicVar.y.a());
                                }
                            }
                            o6c.a();
                            if (t7cVar.r(null, wfc.P0)) {
                                yzcVar2.g();
                                if (yzcVar2.E() == 1) {
                                    long jIntValue3 = ((Integer) wfc.w0.a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    tkcVar4.k.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        tkc.m(thcVar2);
                                        phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    tkc.l(hrcVar);
                                    hrcVar.g();
                                    if (hrcVar.l == null) {
                                        hrcVar.l = new boc(hrcVar, tkcVar3);
                                    }
                                    hrcVar.l.b(jMax);
                                }
                            }
                            zicVar.o.b(true);
                        }
                        thc thcVar14 = tkcVar.f;
                        tkc.m(thcVar14);
                        thcVar14.f.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = tkcVar.a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            wgcVar2.k = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    wgcVar2.k = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it.next();
                                    yzcVar3 = tkcVar7.i;
                                    tkc.k(yzcVar3);
                                }
                            } while (yzcVar3.l0("safelisted event", str3));
                        } else {
                            tkc.m(thcVar6);
                            thcVar6.k.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            wgcVar2.n = ye5.a(context2) ? 1 : 0;
                        } else {
                            wgcVar2.n = 0;
                        }
                        wgcVar2.a.C.incrementAndGet();
                        wgcVar2.b = true;
                        wrcVar = new wrc(tkcVar5);
                        wrcVar.i();
                        tkcVar5.u = wrcVar;
                        if (!wrcVar.b) {
                            aa0.c("Can't initialize twice");
                            return;
                        }
                        tkc tkcVar9 = wrcVar.a;
                        wrcVar.c = (JobScheduler) tkcVar9.a.getSystemService("jobscheduler");
                        tkcVar9.C.incrementAndGet();
                        wrcVar.b = true;
                        tkc.m(thcVar3);
                        phcVar = thcVar3.m;
                        phcVar2 = thcVar3.l;
                        phcVar3 = thcVar3.n;
                        phcVar4 = thcVar3.f;
                        t7cVar.m();
                        phcVar2.b(161000L, "App measurement initialized, version");
                        tkc.m(thcVar3);
                        phcVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM = wgcVar.m();
                        if (yzcVar4.M(strM, t7cVar.c)) {
                            tkc.m(thcVar3);
                            phcVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            tkc.m(thcVar3);
                            phcVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                        }
                        tkc.m(thcVar3);
                        phcVar.a("Debug-level message logging enabled");
                        i2 = tkcVar5.A;
                        atomicInteger = tkcVar5.C;
                        if (i2 != atomicInteger.get()) {
                            tkc.m(thcVar3);
                            phcVar4.c(Integer.valueOf(tkcVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        tkcVar5.v = true;
                        j = tkcVar5.D;
                        hrcVar = tkcVar5.m;
                        fkc fkcVar3 = tkcVar5.g;
                        tkc.m(fkcVar3);
                        fkcVar3.g();
                        tkc.j(tkcVar5.u);
                        iL = tkcVar5.u.l();
                        o6c.a();
                        zR = t7cVar.r(null, wfc.P0);
                        if (iL == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zR) {
                            yzcVar4.g();
                            if (yzcVar4.E() == 1) {
                                yzcVar4.g();
                                IntentFilter intentFilter4 = new IntentFilter();
                                intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z3 = z;
                                thcVar = thcVar3;
                                vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter4, 2);
                                thc thcVar15 = tkcVar6.f;
                                tkc.m(thcVar15);
                                thcVar15.m.a("Registered app receiver");
                                if (z3) {
                                    tkc.j(tkcVar5.u);
                                    tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                yzcVar4.g();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z3 = z;
                                thcVar = thcVar3;
                                vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter5, 2);
                                thc thcVar16 = tkcVar6.f;
                                tkc.m(thcVar16);
                                thcVar16.m.a("Registered app receiver");
                                if (z3) {
                                    tkc.j(tkcVar5.u);
                                    tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                                }
                            } else {
                                thcVar = thcVar3;
                            }
                        } else if (z) {
                            z = true;
                            yzcVar4.g();
                            IntentFilter intentFilter6 = new IntentFilter();
                            intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z3 = z;
                            thcVar = thcVar3;
                            vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter6, 2);
                            thc thcVar17 = tkcVar6.f;
                            tkc.m(thcVar17);
                            thcVar17.m.a("Registered app receiver");
                            if (z3) {
                                tkc.j(tkcVar5.u);
                                tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                            }
                        } else {
                            thcVar = thcVar3;
                        }
                        xicVar = zicVar.g;
                        nncVarN = zicVar.n();
                        int i6 = nncVarN.b;
                        hncVarW = t7cVar.w("google_analytics_default_allow_ad_storage", false);
                        hncVarW2 = t7cVar.w("google_analytics_default_allow_analytics_storage", false);
                        lncVar = lnc.ANALYTICS_STORAGE;
                        hncVar = hnc.UNINITIALIZED;
                        if (hncVarW == hncVar) {
                            tkcVar2 = tkcVar5;
                            phcVar5 = phcVar4;
                            yzcVar = yzcVar4;
                            if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(lnc.class);
                                enumMap3.put(lnc.AD_STORAGE, hncVarW);
                                enumMap3.put(lncVar, hncVarW2);
                                nncVar = new nnc(enumMap3, -10);
                                z2 = false;
                            } else {
                                if (TextUtils.isEmpty(tkcVar2.r().n())) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                nncVar = null;
                            }
                        } else {
                            tkcVar2 = tkcVar5;
                            phcVar5 = phcVar4;
                            yzcVar = yzcVar4;
                            if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(lnc.class);
                                enumMap4.put(lnc.AD_STORAGE, hncVarW);
                                enumMap4.put(lncVar, hncVarW2);
                                nncVar = new nnc(enumMap4, -10);
                                z2 = false;
                            } else {
                                if (TextUtils.isEmpty(tkcVar2.r().n())) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                nncVar = null;
                            }
                        }
                        if (nncVar != null) {
                            tkc.l(hrcVar);
                            hrcVar.C(nncVar, true);
                        } else {
                            nncVar = nncVarN;
                        }
                        tkc.l(hrcVar);
                        tkcVar3 = hrcVar.a;
                        hrcVar.G(nncVar);
                        zicVar.g();
                        int i7 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
                        hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                        if (hncVarW3 != hncVar) {
                            tkc.m(thcVar);
                            phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
                        }
                        hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
                        if (hncVarW4 == hncVar) {
                            if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                                tkc.l(hrcVar);
                                hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                            tkc.l(hrcVar);
                            hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolT = t7cVar.t("google_analytics_tcf_data_enabled");
                        if (boolT != null) {
                            tkc.m(thcVar);
                            phcVar.a("TCF client enabled.");
                            tkc.l(hrcVar);
                            hrcVar.g();
                            thc thcVar18 = tkcVar3.f;
                            tkc.m(thcVar18);
                            thcVar18.m.a("Register tcfPrefChangeListener.");
                            if (hrcVar.t == null) {
                                hrcVar.u = new voc(hrcVar, tkcVar3);
                                hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                        hrc hrcVar2 = hrcVar;
                                        hrcVar2.getClass();
                                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                            thc thcVar19 = hrcVar2.a.f;
                                            tkc.m(thcVar19);
                                            thcVar19.n.a("IABTCF_TCString change picked up in listener.");
                                            voc vocVar = hrcVar2.u;
                                            a78.g(vocVar);
                                            vocVar.b(500L);
                                        }
                                    }
                                };
                            }
                            zic zicVar7 = tkcVar3.e;
                            tkc.k(zicVar7);
                            zicVar7.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                            tkc.l(hrcVar);
                            hrcVar.m();
                        } else {
                            tkc.m(thcVar);
                            phcVar.a("TCF client enabled.");
                            tkc.l(hrcVar);
                            hrcVar.g();
                            thc thcVar19 = tkcVar3.f;
                            tkc.m(thcVar19);
                            thcVar19.m.a("Register tcfPrefChangeListener.");
                            if (hrcVar.t == null) {
                                hrcVar.u = new voc(hrcVar, tkcVar3);
                                hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                        hrc hrcVar2 = hrcVar;
                                        hrcVar2.getClass();
                                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                            thc thcVar110 = hrcVar2.a.f;
                                            tkc.m(thcVar110);
                                            thcVar110.n.a("IABTCF_TCString change picked up in listener.");
                                            voc vocVar = hrcVar2.u;
                                            a78.g(vocVar);
                                            vocVar.b(500L);
                                        }
                                    }
                                };
                            }
                            zic zicVar8 = tkcVar3.e;
                            tkc.k(zicVar8);
                            zicVar8.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                            tkc.l(hrcVar);
                            hrcVar.m();
                        }
                        ticVar = zicVar.f;
                        if (ticVar.a() == 0) {
                            tkc.m(thcVar);
                            phcVar3.b(Long.valueOf(j), "Persisting first open");
                            ticVar.b(j);
                        }
                        tkc.l(hrcVar);
                        s7dVar = hrcVar.q;
                        if (s7dVar.c()) {
                            zic zicVar9 = s7dVar.a.e;
                            tkc.k(zicVar9);
                            zicVar9.w.b(null);
                        }
                        if (tkcVar2.h()) {
                            if (tkcVar2.d()) {
                                yzcVar2 = yzcVar;
                                if (yzcVar2.K("android.permission.INTERNET")) {
                                    tkc.m(thcVar);
                                    phcVar6 = phcVar5;
                                    phcVar6.a("App is missing INTERNET permission");
                                } else {
                                    phcVar6 = phcVar5;
                                }
                                if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                    tkc.m(thcVar);
                                    phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                tkcVar4 = tkcVar2;
                                context = tkcVar4.a;
                                if (!wqb.a(context).c()) {
                                    if (!yzc.c0(context)) {
                                        tkc.m(thcVar);
                                        phcVar6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!yzc.B(context)) {
                                        tkc.m(thcVar);
                                        phcVar6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                tkc.m(thcVar);
                                phcVar6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                tkcVar4 = tkcVar2;
                                yzcVar2 = yzcVar;
                            }
                            thcVar2 = thcVar;
                        } else {
                            tkcVar4 = tkcVar2;
                            yzcVar2 = yzcVar;
                            if (TextUtils.isEmpty(tkcVar4.r().n())) {
                                String strN5 = tkcVar4.r().n();
                                zicVar.g();
                                String string4 = zicVar.k().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strN5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                if (zIsEmpty) {
                                    xicVar2 = xicVar;
                                } else {
                                    xicVar2 = xicVar;
                                }
                                String strN6 = tkcVar4.r().n();
                                zicVar.g();
                                SharedPreferences.Editor editorEdit6 = zicVar.k().edit();
                                editorEdit6.putString("gmp_app_id", strN6);
                                editorEdit6.apply();
                            } else {
                                xicVar2 = xicVar;
                            }
                            if (!zicVar.n().i(lncVar)) {
                                xicVar2.b(null);
                            }
                            tkc.l(hrcVar);
                            hrcVar.g.set(xicVar2.a());
                            tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            thcVar2 = thcVar;
                            if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                                zD = tkcVar4.d();
                                sharedPreferences = zicVar.c;
                                if (sharedPreferences == null) {
                                    zContains = z2;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    zicVar.o(!zD);
                                }
                                if (zD) {
                                    tkc.l(hrcVar);
                                    hrcVar.s();
                                }
                                cxc cxcVar4 = tkcVar4.h;
                                tkc.l(cxcVar4);
                                cxcVar4.e.a();
                                tkcVar4.p().k(new AtomicReference());
                                tkcVar4.p().l(zicVar.y.a());
                            }
                        }
                        o6c.a();
                        if (t7cVar.r(null, wfc.P0)) {
                            yzcVar2.g();
                            if (yzcVar2.E() == 1) {
                                long jIntValue4 = ((Integer) wfc.w0.a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                tkcVar4.k.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    tkc.m(thcVar2);
                                    phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                tkc.l(hrcVar);
                                hrcVar.g();
                                if (hrcVar.l == null) {
                                    hrcVar.l = new boc(hrcVar, tkcVar3);
                                }
                                hrcVar.l.b(jMax);
                            }
                        }
                        zicVar.o.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str = packageInfo.versionName;
                        i = packageInfo.versionCode;
                        wgcVar = wgcVar;
                        str2 = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                wgcVar2.c = packageName;
                wgcVar2.f = str2;
                wgcVar2.d = str;
                wgcVar2.e = i;
                wgcVar2.g = string;
                wgcVar2.h = 0L;
                iG = tkcVar7.g();
                if (iG == 0) {
                    tkc.m(thcVar6);
                    thcVar6.n.a("App measurement collection enabled");
                } else if (iG == 1) {
                    tkc.m(thcVar6);
                    thcVar6.l.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    tkc.m(thcVar6);
                    thcVar6.l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    tkc.m(thcVar6);
                    thcVar6.l.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    tkc.m(thcVar6);
                    thcVar6.k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    tkc.m(thcVar6);
                    thcVar6.l.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    tkc.m(thcVar6);
                    thcVar6.l.a("App measurement disabled");
                    tkc.m(thcVar6);
                    thcVar6.g.a("Invalid scion state in identity");
                } else {
                    tkc.m(thcVar6);
                    thcVar6.l.a("App measurement disabled due to denied storage consent");
                }
                wgcVar2.o = BuildConfig.FLAVOR;
                strD = wgcVar2.m;
                if (TextUtils.isEmpty(strD)) {
                    strD = s7.d(context2, tkcVar7.p);
                }
                if (!TextUtils.isEmpty(strD)) {
                    str4 = strD;
                }
                wgcVar2.o = str4;
                if (iG == 0) {
                    tkc.m(thcVar6);
                    thcVar6.n.c(wgcVar2.c, wgcVar2.o, "App measurement enabled for app package, google app id");
                }
                wgcVar2.k = null;
                t7c t7cVar3 = tkcVar7.d;
                tkcVar = t7cVar3.a;
                a78.d("analytics.safelisted_events");
                bundleS = t7cVar3.s();
                if (bundleS != null) {
                    if (bundleS.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleS.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = tkcVar.a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = null;
                        } else {
                            listAsList = Arrays.asList(stringArray);
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        wgcVar2.k = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                wgcVar2.k = listAsList;
                                break;
                            } else {
                                str3 = (String) it.next();
                                yzcVar3 = tkcVar7.i;
                                tkc.k(yzcVar3);
                            }
                        } while (yzcVar3.l0("safelisted event", str3));
                    } else {
                        tkc.m(thcVar6);
                        thcVar6.k.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        wgcVar2.n = ye5.a(context2) ? 1 : 0;
                    } else {
                        wgcVar2.n = 0;
                    }
                    wgcVar2.a.C.incrementAndGet();
                    wgcVar2.b = true;
                    wrcVar = new wrc(tkcVar5);
                    wrcVar.i();
                    tkcVar5.u = wrcVar;
                    if (!wrcVar.b) {
                        aa0.c("Can't initialize twice");
                        return;
                    }
                    tkc tkcVar10 = wrcVar.a;
                    wrcVar.c = (JobScheduler) tkcVar10.a.getSystemService("jobscheduler");
                    tkcVar10.C.incrementAndGet();
                    wrcVar.b = true;
                    tkc.m(thcVar3);
                    phcVar = thcVar3.m;
                    phcVar2 = thcVar3.l;
                    phcVar3 = thcVar3.n;
                    phcVar4 = thcVar3.f;
                    t7cVar.m();
                    phcVar2.b(161000L, "App measurement initialized, version");
                    tkc.m(thcVar3);
                    phcVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM = wgcVar.m();
                    if (yzcVar4.M(strM, t7cVar.c)) {
                        tkc.m(thcVar3);
                        phcVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        tkc.m(thcVar3);
                        phcVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                    }
                    tkc.m(thcVar3);
                    phcVar.a("Debug-level message logging enabled");
                    i2 = tkcVar5.A;
                    atomicInteger = tkcVar5.C;
                    if (i2 != atomicInteger.get()) {
                        tkc.m(thcVar3);
                        phcVar4.c(Integer.valueOf(tkcVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    tkcVar5.v = true;
                    j = tkcVar5.D;
                    hrcVar = tkcVar5.m;
                    fkc fkcVar4 = tkcVar5.g;
                    tkc.m(fkcVar4);
                    fkcVar4.g();
                    tkc.j(tkcVar5.u);
                    iL = tkcVar5.u.l();
                    o6c.a();
                    zR = t7cVar.r(null, wfc.P0);
                    if (iL == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zR) {
                        yzcVar4.g();
                        if (yzcVar4.E() == 1) {
                            yzcVar4.g();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z3 = z;
                            thcVar = thcVar3;
                            vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter7, 2);
                            thc thcVar110 = tkcVar6.f;
                            tkc.m(thcVar110);
                            thcVar110.m.a("Registered app receiver");
                            if (z3) {
                                tkc.j(tkcVar5.u);
                                tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            yzcVar4.g();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z3 = z;
                            thcVar = thcVar3;
                            vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter8, 2);
                            thc thcVar111 = tkcVar6.f;
                            tkc.m(thcVar111);
                            thcVar111.m.a("Registered app receiver");
                            if (z3) {
                                tkc.j(tkcVar5.u);
                                tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                            }
                        } else {
                            thcVar = thcVar3;
                        }
                    } else if (z) {
                        z = true;
                        yzcVar4.g();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z3 = z;
                        thcVar = thcVar3;
                        vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter9, 2);
                        thc thcVar112 = tkcVar6.f;
                        tkc.m(thcVar112);
                        thcVar112.m.a("Registered app receiver");
                        if (z3) {
                            tkc.j(tkcVar5.u);
                            tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                        }
                    } else {
                        thcVar = thcVar3;
                    }
                    xicVar = zicVar.g;
                    nncVarN = zicVar.n();
                    int i8 = nncVarN.b;
                    hncVarW = t7cVar.w("google_analytics_default_allow_ad_storage", false);
                    hncVarW2 = t7cVar.w("google_analytics_default_allow_analytics_storage", false);
                    lncVar = lnc.ANALYTICS_STORAGE;
                    hncVar = hnc.UNINITIALIZED;
                    if (hncVarW == hncVar) {
                        tkcVar2 = tkcVar5;
                        phcVar5 = phcVar4;
                        yzcVar = yzcVar4;
                        if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(lnc.class);
                            enumMap5.put(lnc.AD_STORAGE, hncVarW);
                            enumMap5.put(lncVar, hncVarW2);
                            nncVar = new nnc(enumMap5, -10);
                            z2 = false;
                        } else {
                            if (TextUtils.isEmpty(tkcVar2.r().n())) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            nncVar = null;
                        }
                    } else {
                        tkcVar2 = tkcVar5;
                        phcVar5 = phcVar4;
                        yzcVar = yzcVar4;
                        if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(lnc.class);
                            enumMap6.put(lnc.AD_STORAGE, hncVarW);
                            enumMap6.put(lncVar, hncVarW2);
                            nncVar = new nnc(enumMap6, -10);
                            z2 = false;
                        } else {
                            if (TextUtils.isEmpty(tkcVar2.r().n())) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            nncVar = null;
                        }
                    }
                    if (nncVar != null) {
                        tkc.l(hrcVar);
                        hrcVar.C(nncVar, true);
                    } else {
                        nncVar = nncVarN;
                    }
                    tkc.l(hrcVar);
                    tkcVar3 = hrcVar.a;
                    hrcVar.G(nncVar);
                    zicVar.g();
                    int i9 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
                    hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                    if (hncVarW3 != hncVar) {
                        tkc.m(thcVar);
                        phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
                    }
                    hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
                    if (hncVarW4 == hncVar) {
                        if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                            tkc.l(hrcVar);
                            hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                        tkc.l(hrcVar);
                        hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolT = t7cVar.t("google_analytics_tcf_data_enabled");
                    if (boolT != null) {
                        tkc.m(thcVar);
                        phcVar.a("TCF client enabled.");
                        tkc.l(hrcVar);
                        hrcVar.g();
                        thc thcVar113 = tkcVar3.f;
                        tkc.m(thcVar113);
                        thcVar113.m.a("Register tcfPrefChangeListener.");
                        if (hrcVar.t == null) {
                            hrcVar.u = new voc(hrcVar, tkcVar3);
                            hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                    hrc hrcVar2 = hrcVar;
                                    hrcVar2.getClass();
                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                        thc thcVar114 = hrcVar2.a.f;
                                        tkc.m(thcVar114);
                                        thcVar114.n.a("IABTCF_TCString change picked up in listener.");
                                        voc vocVar = hrcVar2.u;
                                        a78.g(vocVar);
                                        vocVar.b(500L);
                                    }
                                }
                            };
                        }
                        zic zicVar10 = tkcVar3.e;
                        tkc.k(zicVar10);
                        zicVar10.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                        tkc.l(hrcVar);
                        hrcVar.m();
                    } else {
                        tkc.m(thcVar);
                        phcVar.a("TCF client enabled.");
                        tkc.l(hrcVar);
                        hrcVar.g();
                        thc thcVar114 = tkcVar3.f;
                        tkc.m(thcVar114);
                        thcVar114.m.a("Register tcfPrefChangeListener.");
                        if (hrcVar.t == null) {
                            hrcVar.u = new voc(hrcVar, tkcVar3);
                            hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                    hrc hrcVar2 = hrcVar;
                                    hrcVar2.getClass();
                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                        thc thcVar115 = hrcVar2.a.f;
                                        tkc.m(thcVar115);
                                        thcVar115.n.a("IABTCF_TCString change picked up in listener.");
                                        voc vocVar = hrcVar2.u;
                                        a78.g(vocVar);
                                        vocVar.b(500L);
                                    }
                                }
                            };
                        }
                        zic zicVar11 = tkcVar3.e;
                        tkc.k(zicVar11);
                        zicVar11.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                        tkc.l(hrcVar);
                        hrcVar.m();
                    }
                    ticVar = zicVar.f;
                    if (ticVar.a() == 0) {
                        tkc.m(thcVar);
                        phcVar3.b(Long.valueOf(j), "Persisting first open");
                        ticVar.b(j);
                    }
                    tkc.l(hrcVar);
                    s7dVar = hrcVar.q;
                    if (s7dVar.c()) {
                        zic zicVar12 = s7dVar.a.e;
                        tkc.k(zicVar12);
                        zicVar12.w.b(null);
                    }
                    if (tkcVar2.h()) {
                        if (tkcVar2.d()) {
                            yzcVar2 = yzcVar;
                            if (yzcVar2.K("android.permission.INTERNET")) {
                                tkc.m(thcVar);
                                phcVar6 = phcVar5;
                                phcVar6.a("App is missing INTERNET permission");
                            } else {
                                phcVar6 = phcVar5;
                            }
                            if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                                tkc.m(thcVar);
                                phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            tkcVar4 = tkcVar2;
                            context = tkcVar4.a;
                            if (!wqb.a(context).c()) {
                                if (!yzc.c0(context)) {
                                    tkc.m(thcVar);
                                    phcVar6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!yzc.B(context)) {
                                    tkc.m(thcVar);
                                    phcVar6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            tkc.m(thcVar);
                            phcVar6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            tkcVar4 = tkcVar2;
                            yzcVar2 = yzcVar;
                        }
                        thcVar2 = thcVar;
                    } else {
                        tkcVar4 = tkcVar2;
                        yzcVar2 = yzcVar;
                        if (TextUtils.isEmpty(tkcVar4.r().n())) {
                            String strN7 = tkcVar4.r().n();
                            zicVar.g();
                            String string5 = zicVar.k().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strN7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                            if (zIsEmpty) {
                                xicVar2 = xicVar;
                            } else {
                                xicVar2 = xicVar;
                            }
                            String strN8 = tkcVar4.r().n();
                            zicVar.g();
                            SharedPreferences.Editor editorEdit7 = zicVar.k().edit();
                            editorEdit7.putString("gmp_app_id", strN8);
                            editorEdit7.apply();
                        } else {
                            xicVar2 = xicVar;
                        }
                        if (!zicVar.n().i(lncVar)) {
                            xicVar2.b(null);
                        }
                        tkc.l(hrcVar);
                        hrcVar.g.set(xicVar2.a());
                        tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        thcVar2 = thcVar;
                        if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                            zD = tkcVar4.d();
                            sharedPreferences = zicVar.c;
                            if (sharedPreferences == null) {
                                zContains = z2;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                zicVar.o(!zD);
                            }
                            if (zD) {
                                tkc.l(hrcVar);
                                hrcVar.s();
                            }
                            cxc cxcVar5 = tkcVar4.h;
                            tkc.l(cxcVar5);
                            cxcVar5.e.a();
                            tkcVar4.p().k(new AtomicReference());
                            tkcVar4.p().l(zicVar.y.a());
                        }
                    }
                    o6c.a();
                    if (t7cVar.r(null, wfc.P0)) {
                        yzcVar2.g();
                        if (yzcVar2.E() == 1) {
                            long jIntValue5 = ((Integer) wfc.w0.a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            tkcVar4.k.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                tkc.m(thcVar2);
                                phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            tkc.l(hrcVar);
                            hrcVar.g();
                            if (hrcVar.l == null) {
                                hrcVar.l = new boc(hrcVar, tkcVar3);
                            }
                            hrcVar.l.b(jMax);
                        }
                    }
                    zicVar.o.b(true);
                }
                thc thcVar115 = tkcVar.f;
                tkc.m(thcVar115);
                thcVar115.f.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = tkcVar.a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    wgcVar2.k = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            wgcVar2.k = listAsList;
                            break;
                        } else {
                            str3 = (String) it.next();
                            yzcVar3 = tkcVar7.i;
                            tkc.k(yzcVar3);
                        }
                    } while (yzcVar3.l0("safelisted event", str3));
                } else {
                    tkc.m(thcVar6);
                    thcVar6.k.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    wgcVar2.n = ye5.a(context2) ? 1 : 0;
                } else {
                    wgcVar2.n = 0;
                }
                wgcVar2.a.C.incrementAndGet();
                wgcVar2.b = true;
                wrcVar = new wrc(tkcVar5);
                wrcVar.i();
                tkcVar5.u = wrcVar;
                if (!wrcVar.b) {
                    aa0.c("Can't initialize twice");
                    return;
                }
                tkc tkcVar11 = wrcVar.a;
                wrcVar.c = (JobScheduler) tkcVar11.a.getSystemService("jobscheduler");
                tkcVar11.C.incrementAndGet();
                wrcVar.b = true;
                tkc.m(thcVar3);
                phcVar = thcVar3.m;
                phcVar2 = thcVar3.l;
                phcVar3 = thcVar3.n;
                phcVar4 = thcVar3.f;
                t7cVar.m();
                phcVar2.b(161000L, "App measurement initialized, version");
                tkc.m(thcVar3);
                phcVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM = wgcVar.m();
                if (yzcVar4.M(strM, t7cVar.c)) {
                    tkc.m(thcVar3);
                    phcVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    tkc.m(thcVar3);
                    phcVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                }
                tkc.m(thcVar3);
                phcVar.a("Debug-level message logging enabled");
                i2 = tkcVar5.A;
                atomicInteger = tkcVar5.C;
                if (i2 != atomicInteger.get()) {
                    tkc.m(thcVar3);
                    phcVar4.c(Integer.valueOf(tkcVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                tkcVar5.v = true;
                j = tkcVar5.D;
                hrcVar = tkcVar5.m;
                fkc fkcVar5 = tkcVar5.g;
                tkc.m(fkcVar5);
                fkcVar5.g();
                tkc.j(tkcVar5.u);
                iL = tkcVar5.u.l();
                o6c.a();
                zR = t7cVar.r(null, wfc.P0);
                if (iL == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zR) {
                    yzcVar4.g();
                    if (yzcVar4.E() == 1) {
                        yzcVar4.g();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z3 = z;
                        thcVar = thcVar3;
                        vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter10, 2);
                        thc thcVar116 = tkcVar6.f;
                        tkc.m(thcVar116);
                        thcVar116.m.a("Registered app receiver");
                        if (z3) {
                            tkc.j(tkcVar5.u);
                            tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        yzcVar4.g();
                        IntentFilter intentFilter11 = new IntentFilter();
                        intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z3 = z;
                        thcVar = thcVar3;
                        vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter11, 2);
                        thc thcVar117 = tkcVar6.f;
                        tkc.m(thcVar117);
                        thcVar117.m.a("Registered app receiver");
                        if (z3) {
                            tkc.j(tkcVar5.u);
                            tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                        }
                    } else {
                        thcVar = thcVar3;
                    }
                } else if (z) {
                    z = true;
                    yzcVar4.g();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z3 = z;
                    thcVar = thcVar3;
                    vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter12, 2);
                    thc thcVar118 = tkcVar6.f;
                    tkc.m(thcVar118);
                    thcVar118.m.a("Registered app receiver");
                    if (z3) {
                        tkc.j(tkcVar5.u);
                        tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                    }
                } else {
                    thcVar = thcVar3;
                }
                xicVar = zicVar.g;
                nncVarN = zicVar.n();
                int i10 = nncVarN.b;
                hncVarW = t7cVar.w("google_analytics_default_allow_ad_storage", false);
                hncVarW2 = t7cVar.w("google_analytics_default_allow_analytics_storage", false);
                lncVar = lnc.ANALYTICS_STORAGE;
                hncVar = hnc.UNINITIALIZED;
                if (hncVarW == hncVar) {
                    tkcVar2 = tkcVar5;
                    phcVar5 = phcVar4;
                    yzcVar = yzcVar4;
                    if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(lnc.class);
                        enumMap7.put(lnc.AD_STORAGE, hncVarW);
                        enumMap7.put(lncVar, hncVarW2);
                        nncVar = new nnc(enumMap7, -10);
                        z2 = false;
                    } else {
                        if (TextUtils.isEmpty(tkcVar2.r().n())) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nncVar = null;
                    }
                } else {
                    tkcVar2 = tkcVar5;
                    phcVar5 = phcVar4;
                    yzcVar = yzcVar4;
                    if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(lnc.class);
                        enumMap8.put(lnc.AD_STORAGE, hncVarW);
                        enumMap8.put(lncVar, hncVarW2);
                        nncVar = new nnc(enumMap8, -10);
                        z2 = false;
                    } else {
                        if (TextUtils.isEmpty(tkcVar2.r().n())) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nncVar = null;
                    }
                }
                if (nncVar != null) {
                    tkc.l(hrcVar);
                    hrcVar.C(nncVar, true);
                } else {
                    nncVar = nncVarN;
                }
                tkc.l(hrcVar);
                tkcVar3 = hrcVar.a;
                hrcVar.G(nncVar);
                zicVar.g();
                int i11 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
                hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
                if (hncVarW3 != hncVar) {
                    tkc.m(thcVar);
                    phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
                }
                hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
                if (hncVarW4 == hncVar) {
                    if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                        tkc.l(hrcVar);
                        hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                    tkc.l(hrcVar);
                    hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolT = t7cVar.t("google_analytics_tcf_data_enabled");
                if (boolT != null) {
                    tkc.m(thcVar);
                    phcVar.a("TCF client enabled.");
                    tkc.l(hrcVar);
                    hrcVar.g();
                    thc thcVar119 = tkcVar3.f;
                    tkc.m(thcVar119);
                    thcVar119.m.a("Register tcfPrefChangeListener.");
                    if (hrcVar.t == null) {
                        hrcVar.u = new voc(hrcVar, tkcVar3);
                        hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                hrc hrcVar2 = hrcVar;
                                hrcVar2.getClass();
                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                    thc thcVar1110 = hrcVar2.a.f;
                                    tkc.m(thcVar1110);
                                    thcVar1110.n.a("IABTCF_TCString change picked up in listener.");
                                    voc vocVar = hrcVar2.u;
                                    a78.g(vocVar);
                                    vocVar.b(500L);
                                }
                            }
                        };
                    }
                    zic zicVar13 = tkcVar3.e;
                    tkc.k(zicVar13);
                    zicVar13.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                    tkc.l(hrcVar);
                    hrcVar.m();
                } else {
                    tkc.m(thcVar);
                    phcVar.a("TCF client enabled.");
                    tkc.l(hrcVar);
                    hrcVar.g();
                    thc thcVar1110 = tkcVar3.f;
                    tkc.m(thcVar1110);
                    thcVar1110.m.a("Register tcfPrefChangeListener.");
                    if (hrcVar.t == null) {
                        hrcVar.u = new voc(hrcVar, tkcVar3);
                        hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                hrc hrcVar2 = hrcVar;
                                hrcVar2.getClass();
                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                    thc thcVar1111 = hrcVar2.a.f;
                                    tkc.m(thcVar1111);
                                    thcVar1111.n.a("IABTCF_TCString change picked up in listener.");
                                    voc vocVar = hrcVar2.u;
                                    a78.g(vocVar);
                                    vocVar.b(500L);
                                }
                            }
                        };
                    }
                    zic zicVar14 = tkcVar3.e;
                    tkc.k(zicVar14);
                    zicVar14.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                    tkc.l(hrcVar);
                    hrcVar.m();
                }
                ticVar = zicVar.f;
                if (ticVar.a() == 0) {
                    tkc.m(thcVar);
                    phcVar3.b(Long.valueOf(j), "Persisting first open");
                    ticVar.b(j);
                }
                tkc.l(hrcVar);
                s7dVar = hrcVar.q;
                if (s7dVar.c()) {
                    zic zicVar15 = s7dVar.a.e;
                    tkc.k(zicVar15);
                    zicVar15.w.b(null);
                }
                if (tkcVar2.h()) {
                    if (tkcVar2.d()) {
                        yzcVar2 = yzcVar;
                        if (yzcVar2.K("android.permission.INTERNET")) {
                            tkc.m(thcVar);
                            phcVar6 = phcVar5;
                            phcVar6.a("App is missing INTERNET permission");
                        } else {
                            phcVar6 = phcVar5;
                        }
                        if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                            tkc.m(thcVar);
                            phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        tkcVar4 = tkcVar2;
                        context = tkcVar4.a;
                        if (!wqb.a(context).c()) {
                            if (!yzc.c0(context)) {
                                tkc.m(thcVar);
                                phcVar6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!yzc.B(context)) {
                                tkc.m(thcVar);
                                phcVar6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        tkc.m(thcVar);
                        phcVar6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        tkcVar4 = tkcVar2;
                        yzcVar2 = yzcVar;
                    }
                    thcVar2 = thcVar;
                } else {
                    tkcVar4 = tkcVar2;
                    yzcVar2 = yzcVar;
                    if (TextUtils.isEmpty(tkcVar4.r().n())) {
                        String strN9 = tkcVar4.r().n();
                        zicVar.g();
                        String string6 = zicVar.k().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strN9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                        if (zIsEmpty) {
                            xicVar2 = xicVar;
                        } else {
                            xicVar2 = xicVar;
                        }
                        String strN10 = tkcVar4.r().n();
                        zicVar.g();
                        SharedPreferences.Editor editorEdit8 = zicVar.k().edit();
                        editorEdit8.putString("gmp_app_id", strN10);
                        editorEdit8.apply();
                    } else {
                        xicVar2 = xicVar;
                    }
                    if (!zicVar.n().i(lncVar)) {
                        xicVar2.b(null);
                    }
                    tkc.l(hrcVar);
                    hrcVar.g.set(xicVar2.a());
                    tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    thcVar2 = thcVar;
                    if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                        zD = tkcVar4.d();
                        sharedPreferences = zicVar.c;
                        if (sharedPreferences == null) {
                            zContains = z2;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            zicVar.o(!zD);
                        }
                        if (zD) {
                            tkc.l(hrcVar);
                            hrcVar.s();
                        }
                        cxc cxcVar6 = tkcVar4.h;
                        tkc.l(cxcVar6);
                        cxcVar6.e.a();
                        tkcVar4.p().k(new AtomicReference());
                        tkcVar4.p().l(zicVar.y.a());
                    }
                }
                o6c.a();
                if (t7cVar.r(null, wfc.P0)) {
                    yzcVar2.g();
                    if (yzcVar2.E() == 1) {
                        long jIntValue6 = ((Integer) wfc.w0.a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        tkcVar4.k.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            tkc.m(thcVar2);
                            phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        tkc.l(hrcVar);
                        hrcVar.g();
                        if (hrcVar.l == null) {
                            hrcVar.l = new boc(hrcVar, tkcVar3);
                        }
                        hrcVar.l.b(jMax);
                    }
                }
                zicVar.o.b(true);
            }
            tkc.m(thcVar6);
            thcVar6.f.b(thc.o(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strD = wgcVar2.m;
            if (TextUtils.isEmpty(strD)) {
                strD = s7.d(context2, tkcVar7.p);
            }
            if (!TextUtils.isEmpty(strD)) {
                str4 = strD;
            }
            wgcVar2.o = str4;
            if (iG == 0) {
                tkc.m(thcVar6);
                thcVar6.n.c(wgcVar2.c, wgcVar2.o, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            tkc.m(thcVar6);
            thcVar6.f.c(thc.o(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        string = "Unknown";
        str = string;
        str2 = installerPackageName;
        i = Integer.MIN_VALUE;
        wgcVar2.c = packageName;
        wgcVar2.f = str2;
        wgcVar2.d = str;
        wgcVar2.e = i;
        wgcVar2.g = string;
        wgcVar2.h = 0L;
        iG = tkcVar7.g();
        if (iG == 0) {
            tkc.m(thcVar6);
            thcVar6.n.a("App measurement collection enabled");
        } else if (iG == 1) {
            tkc.m(thcVar6);
            thcVar6.l.a("App measurement deactivated via the manifest");
        } else if (iG == 3) {
            tkc.m(thcVar6);
            thcVar6.l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iG == 4) {
            tkc.m(thcVar6);
            thcVar6.l.a("App measurement disabled via the manifest");
        } else if (iG == 6) {
            tkc.m(thcVar6);
            thcVar6.k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iG == 7) {
            tkc.m(thcVar6);
            thcVar6.l.a("App measurement disabled via the global data collection setting");
        } else if (iG != 8) {
            tkc.m(thcVar6);
            thcVar6.l.a("App measurement disabled");
            tkc.m(thcVar6);
            thcVar6.g.a("Invalid scion state in identity");
        } else {
            tkc.m(thcVar6);
            thcVar6.l.a("App measurement disabled due to denied storage consent");
        }
        wgcVar2.o = BuildConfig.FLAVOR;
        wgcVar2.k = null;
        t7c t7cVar4 = tkcVar7.d;
        tkcVar = t7cVar4.a;
        a78.d("analytics.safelisted_events");
        bundleS = t7cVar4.s();
        if (bundleS != null) {
            if (bundleS.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleS.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = tkcVar.a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                wgcVar2.k = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        wgcVar2.k = listAsList;
                        break;
                    } else {
                        str3 = (String) it.next();
                        yzcVar3 = tkcVar7.i;
                        tkc.k(yzcVar3);
                    }
                } while (yzcVar3.l0("safelisted event", str3));
            } else {
                tkc.m(thcVar6);
                thcVar6.k.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                wgcVar2.n = ye5.a(context2) ? 1 : 0;
            } else {
                wgcVar2.n = 0;
            }
            wgcVar2.a.C.incrementAndGet();
            wgcVar2.b = true;
            wrcVar = new wrc(tkcVar5);
            wrcVar.i();
            tkcVar5.u = wrcVar;
            if (!wrcVar.b) {
                aa0.c("Can't initialize twice");
                return;
            }
            tkc tkcVar12 = wrcVar.a;
            wrcVar.c = (JobScheduler) tkcVar12.a.getSystemService("jobscheduler");
            tkcVar12.C.incrementAndGet();
            wrcVar.b = true;
            tkc.m(thcVar3);
            phcVar = thcVar3.m;
            phcVar2 = thcVar3.l;
            phcVar3 = thcVar3.n;
            phcVar4 = thcVar3.f;
            t7cVar.m();
            phcVar2.b(161000L, "App measurement initialized, version");
            tkc.m(thcVar3);
            phcVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strM = wgcVar.m();
            if (yzcVar4.M(strM, t7cVar.c)) {
                tkc.m(thcVar3);
                phcVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                tkc.m(thcVar3);
                phcVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
            }
            tkc.m(thcVar3);
            phcVar.a("Debug-level message logging enabled");
            i2 = tkcVar5.A;
            atomicInteger = tkcVar5.C;
            if (i2 != atomicInteger.get()) {
                tkc.m(thcVar3);
                phcVar4.c(Integer.valueOf(tkcVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            tkcVar5.v = true;
            j = tkcVar5.D;
            hrcVar = tkcVar5.m;
            fkc fkcVar6 = tkcVar5.g;
            tkc.m(fkcVar6);
            fkcVar6.g();
            tkc.j(tkcVar5.u);
            iL = tkcVar5.u.l();
            o6c.a();
            zR = t7cVar.r(null, wfc.P0);
            if (iL == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zR) {
                yzcVar4.g();
                if (yzcVar4.E() == 1) {
                    yzcVar4.g();
                    IntentFilter intentFilter13 = new IntentFilter();
                    intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z3 = z;
                    thcVar = thcVar3;
                    vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter13, 2);
                    thc thcVar1111 = tkcVar6.f;
                    tkc.m(thcVar1111);
                    thcVar1111.m.a("Registered app receiver");
                    if (z3) {
                        tkc.j(tkcVar5.u);
                        tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    yzcVar4.g();
                    IntentFilter intentFilter14 = new IntentFilter();
                    intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z3 = z;
                    thcVar = thcVar3;
                    vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter14, 2);
                    thc thcVar1112 = tkcVar6.f;
                    tkc.m(thcVar1112);
                    thcVar1112.m.a("Registered app receiver");
                    if (z3) {
                        tkc.j(tkcVar5.u);
                        tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                    }
                } else {
                    thcVar = thcVar3;
                }
            } else if (z) {
                z = true;
                yzcVar4.g();
                IntentFilter intentFilter15 = new IntentFilter();
                intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z3 = z;
                thcVar = thcVar3;
                vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter15, 2);
                thc thcVar1113 = tkcVar6.f;
                tkc.m(thcVar1113);
                thcVar1113.m.a("Registered app receiver");
                if (z3) {
                    tkc.j(tkcVar5.u);
                    tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                }
            } else {
                thcVar = thcVar3;
            }
            xicVar = zicVar.g;
            nncVarN = zicVar.n();
            int i12 = nncVarN.b;
            hncVarW = t7cVar.w("google_analytics_default_allow_ad_storage", false);
            hncVarW2 = t7cVar.w("google_analytics_default_allow_analytics_storage", false);
            lncVar = lnc.ANALYTICS_STORAGE;
            hncVar = hnc.UNINITIALIZED;
            if (hncVarW == hncVar) {
                tkcVar2 = tkcVar5;
                phcVar5 = phcVar4;
                yzcVar = yzcVar4;
                if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(lnc.class);
                    enumMap9.put(lnc.AD_STORAGE, hncVarW);
                    enumMap9.put(lncVar, hncVarW2);
                    nncVar = new nnc(enumMap9, -10);
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(tkcVar2.r().n())) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    nncVar = null;
                }
            } else {
                tkcVar2 = tkcVar5;
                phcVar5 = phcVar4;
                yzcVar = yzcVar4;
                if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(lnc.class);
                    enumMap10.put(lnc.AD_STORAGE, hncVarW);
                    enumMap10.put(lncVar, hncVarW2);
                    nncVar = new nnc(enumMap10, -10);
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(tkcVar2.r().n())) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    nncVar = null;
                }
            }
            if (nncVar != null) {
                tkc.l(hrcVar);
                hrcVar.C(nncVar, true);
            } else {
                nncVar = nncVarN;
            }
            tkc.l(hrcVar);
            tkcVar3 = hrcVar.a;
            hrcVar.G(nncVar);
            zicVar.g();
            int i13 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
            hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
            if (hncVarW3 != hncVar) {
                tkc.m(thcVar);
                phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
            }
            hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
            if (hncVarW4 == hncVar) {
                if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                    tkc.l(hrcVar);
                    hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                tkc.l(hrcVar);
                hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolT = t7cVar.t("google_analytics_tcf_data_enabled");
            if (boolT != null) {
                tkc.m(thcVar);
                phcVar.a("TCF client enabled.");
                tkc.l(hrcVar);
                hrcVar.g();
                thc thcVar1114 = tkcVar3.f;
                tkc.m(thcVar1114);
                thcVar1114.m.a("Register tcfPrefChangeListener.");
                if (hrcVar.t == null) {
                    hrcVar.u = new voc(hrcVar, tkcVar3);
                    hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                            hrc hrcVar2 = hrcVar;
                            hrcVar2.getClass();
                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                thc thcVar1115 = hrcVar2.a.f;
                                tkc.m(thcVar1115);
                                thcVar1115.n.a("IABTCF_TCString change picked up in listener.");
                                voc vocVar = hrcVar2.u;
                                a78.g(vocVar);
                                vocVar.b(500L);
                            }
                        }
                    };
                }
                zic zicVar16 = tkcVar3.e;
                tkc.k(zicVar16);
                zicVar16.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                tkc.l(hrcVar);
                hrcVar.m();
            } else {
                tkc.m(thcVar);
                phcVar.a("TCF client enabled.");
                tkc.l(hrcVar);
                hrcVar.g();
                thc thcVar1115 = tkcVar3.f;
                tkc.m(thcVar1115);
                thcVar1115.m.a("Register tcfPrefChangeListener.");
                if (hrcVar.t == null) {
                    hrcVar.u = new voc(hrcVar, tkcVar3);
                    hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                            hrc hrcVar2 = hrcVar;
                            hrcVar2.getClass();
                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                thc thcVar1116 = hrcVar2.a.f;
                                tkc.m(thcVar1116);
                                thcVar1116.n.a("IABTCF_TCString change picked up in listener.");
                                voc vocVar = hrcVar2.u;
                                a78.g(vocVar);
                                vocVar.b(500L);
                            }
                        }
                    };
                }
                zic zicVar17 = tkcVar3.e;
                tkc.k(zicVar17);
                zicVar17.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
                tkc.l(hrcVar);
                hrcVar.m();
            }
            ticVar = zicVar.f;
            if (ticVar.a() == 0) {
                tkc.m(thcVar);
                phcVar3.b(Long.valueOf(j), "Persisting first open");
                ticVar.b(j);
            }
            tkc.l(hrcVar);
            s7dVar = hrcVar.q;
            if (s7dVar.c()) {
                zic zicVar18 = s7dVar.a.e;
                tkc.k(zicVar18);
                zicVar18.w.b(null);
            }
            if (tkcVar2.h()) {
                if (tkcVar2.d()) {
                    yzcVar2 = yzcVar;
                    if (yzcVar2.K("android.permission.INTERNET")) {
                        tkc.m(thcVar);
                        phcVar6 = phcVar5;
                        phcVar6.a("App is missing INTERNET permission");
                    } else {
                        phcVar6 = phcVar5;
                    }
                    if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                        tkc.m(thcVar);
                        phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    tkcVar4 = tkcVar2;
                    context = tkcVar4.a;
                    if (!wqb.a(context).c()) {
                        if (!yzc.c0(context)) {
                            tkc.m(thcVar);
                            phcVar6.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!yzc.B(context)) {
                            tkc.m(thcVar);
                            phcVar6.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    tkc.m(thcVar);
                    phcVar6.a("Uploading is not possible. App measurement disabled");
                } else {
                    tkcVar4 = tkcVar2;
                    yzcVar2 = yzcVar;
                }
                thcVar2 = thcVar;
            } else {
                tkcVar4 = tkcVar2;
                yzcVar2 = yzcVar;
                if (TextUtils.isEmpty(tkcVar4.r().n())) {
                    String strN11 = tkcVar4.r().n();
                    zicVar.g();
                    String string7 = zicVar.k().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strN11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                    if (zIsEmpty) {
                        xicVar2 = xicVar;
                    } else {
                        xicVar2 = xicVar;
                    }
                    String strN12 = tkcVar4.r().n();
                    zicVar.g();
                    SharedPreferences.Editor editorEdit9 = zicVar.k().edit();
                    editorEdit9.putString("gmp_app_id", strN12);
                    editorEdit9.apply();
                } else {
                    xicVar2 = xicVar;
                }
                if (!zicVar.n().i(lncVar)) {
                    xicVar2.b(null);
                }
                tkc.l(hrcVar);
                hrcVar.g.set(xicVar2.a());
                tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                thcVar2 = thcVar;
                if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                    zD = tkcVar4.d();
                    sharedPreferences = zicVar.c;
                    if (sharedPreferences == null) {
                        zContains = z2;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        zicVar.o(!zD);
                    }
                    if (zD) {
                        tkc.l(hrcVar);
                        hrcVar.s();
                    }
                    cxc cxcVar7 = tkcVar4.h;
                    tkc.l(cxcVar7);
                    cxcVar7.e.a();
                    tkcVar4.p().k(new AtomicReference());
                    tkcVar4.p().l(zicVar.y.a());
                }
            }
            o6c.a();
            if (t7cVar.r(null, wfc.P0)) {
                yzcVar2.g();
                if (yzcVar2.E() == 1) {
                    long jIntValue7 = ((Integer) wfc.w0.a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    tkcVar4.k.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        tkc.m(thcVar2);
                        phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    tkc.l(hrcVar);
                    hrcVar.g();
                    if (hrcVar.l == null) {
                        hrcVar.l = new boc(hrcVar, tkcVar3);
                    }
                    hrcVar.l.b(jMax);
                }
            }
            zicVar.o.b(true);
        }
        thc thcVar1116 = tkcVar.f;
        tkc.m(thcVar1116);
        thcVar1116.f.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = tkcVar.a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            wgcVar2.k = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    wgcVar2.k = listAsList;
                    break;
                } else {
                    str3 = (String) it.next();
                    yzcVar3 = tkcVar7.i;
                    tkc.k(yzcVar3);
                }
            } while (yzcVar3.l0("safelisted event", str3));
        } else {
            tkc.m(thcVar6);
            thcVar6.k.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            wgcVar2.n = ye5.a(context2) ? 1 : 0;
        } else {
            wgcVar2.n = 0;
        }
        wgcVar2.a.C.incrementAndGet();
        wgcVar2.b = true;
        wrcVar = new wrc(tkcVar5);
        wrcVar.i();
        tkcVar5.u = wrcVar;
        if (!wrcVar.b) {
            aa0.c("Can't initialize twice");
            return;
        }
        tkc tkcVar13 = wrcVar.a;
        wrcVar.c = (JobScheduler) tkcVar13.a.getSystemService("jobscheduler");
        tkcVar13.C.incrementAndGet();
        wrcVar.b = true;
        tkc.m(thcVar3);
        phcVar = thcVar3.m;
        phcVar2 = thcVar3.l;
        phcVar3 = thcVar3.n;
        phcVar4 = thcVar3.f;
        t7cVar.m();
        phcVar2.b(161000L, "App measurement initialized, version");
        tkc.m(thcVar3);
        phcVar2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strM = wgcVar.m();
        if (yzcVar4.M(strM, t7cVar.c)) {
            tkc.m(thcVar3);
            phcVar2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            tkc.m(thcVar3);
            phcVar2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
        }
        tkc.m(thcVar3);
        phcVar.a("Debug-level message logging enabled");
        i2 = tkcVar5.A;
        atomicInteger = tkcVar5.C;
        if (i2 != atomicInteger.get()) {
            tkc.m(thcVar3);
            phcVar4.c(Integer.valueOf(tkcVar5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        tkcVar5.v = true;
        j = tkcVar5.D;
        hrcVar = tkcVar5.m;
        fkc fkcVar7 = tkcVar5.g;
        tkc.m(fkcVar7);
        fkcVar7.g();
        tkc.j(tkcVar5.u);
        iL = tkcVar5.u.l();
        o6c.a();
        zR = t7cVar.r(null, wfc.P0);
        if (iL == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zR) {
            yzcVar4.g();
            if (yzcVar4.E() == 1) {
                yzcVar4.g();
                IntentFilter intentFilter16 = new IntentFilter();
                intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z3 = z;
                thcVar = thcVar3;
                vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter16, 2);
                thc thcVar1117 = tkcVar6.f;
                tkc.m(thcVar1117);
                thcVar1117.m.a("Registered app receiver");
                if (z3) {
                    tkc.j(tkcVar5.u);
                    tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                yzcVar4.g();
                IntentFilter intentFilter17 = new IntentFilter();
                intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z3 = z;
                thcVar = thcVar3;
                vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter17, 2);
                thc thcVar1118 = tkcVar6.f;
                tkc.m(thcVar1118);
                thcVar1118.m.a("Registered app receiver");
                if (z3) {
                    tkc.j(tkcVar5.u);
                    tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
                }
            } else {
                thcVar = thcVar3;
            }
        } else if (z) {
            z = true;
            yzcVar4.g();
            IntentFilter intentFilter18 = new IntentFilter();
            intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z3 = z;
            thcVar = thcVar3;
            vz1.d(tkcVar6.a, new p6d(tkcVar6), intentFilter18, 2);
            thc thcVar1119 = tkcVar6.f;
            tkc.m(thcVar1119);
            thcVar1119.m.a("Registered app receiver");
            if (z3) {
                tkc.j(tkcVar5.u);
                tkcVar5.u.k(((Long) wfc.C.a(null)).longValue());
            }
        } else {
            thcVar = thcVar3;
        }
        xicVar = zicVar.g;
        nncVarN = zicVar.n();
        int i14 = nncVarN.b;
        hncVarW = t7cVar.w("google_analytics_default_allow_ad_storage", false);
        hncVarW2 = t7cVar.w("google_analytics_default_allow_analytics_storage", false);
        lncVar = lnc.ANALYTICS_STORAGE;
        hncVar = hnc.UNINITIALIZED;
        if (hncVarW == hncVar) {
            tkcVar2 = tkcVar5;
            phcVar5 = phcVar4;
            yzcVar = yzcVar4;
            if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(lnc.class);
                enumMap11.put(lnc.AD_STORAGE, hncVarW);
                enumMap11.put(lncVar, hncVarW2);
                nncVar = new nnc(enumMap11, -10);
                z2 = false;
            } else {
                if (TextUtils.isEmpty(tkcVar2.r().n())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                nncVar = null;
            }
        } else {
            tkcVar2 = tkcVar5;
            phcVar5 = phcVar4;
            yzcVar = yzcVar4;
            if (nnc.l(-10, zicVar.k().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(lnc.class);
                enumMap12.put(lnc.AD_STORAGE, hncVarW);
                enumMap12.put(lncVar, hncVarW2);
                nncVar = new nnc(enumMap12, -10);
                z2 = false;
            } else {
                if (TextUtils.isEmpty(tkcVar2.r().n())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                nncVar = null;
            }
        }
        if (nncVar != null) {
            tkc.l(hrcVar);
            hrcVar.C(nncVar, true);
        } else {
            nncVar = nncVarN;
        }
        tkc.l(hrcVar);
        tkcVar3 = hrcVar.a;
        hrcVar.G(nncVar);
        zicVar.g();
        int i15 = m9c.b(zicVar.k().getString("dma_consent_settings", null)).a;
        hncVarW3 = t7cVar.w("google_analytics_default_allow_ad_personalization_signals", true);
        if (hncVarW3 != hncVar) {
            tkc.m(thcVar);
            phcVar3.b(hncVarW3, "Default ad personalization consent from Manifest");
        }
        hncVarW4 = t7cVar.w("google_analytics_default_allow_ad_user_data", true);
        if (hncVarW4 == hncVar) {
            if (!TextUtils.isEmpty(tkcVar2.r().n())) {
                tkc.l(hrcVar);
                hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(tkcVar2.r().n())) {
            tkc.l(hrcVar);
            hrcVar.B(new m9c((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolT = t7cVar.t("google_analytics_tcf_data_enabled");
        if (boolT != null) {
            tkc.m(thcVar);
            phcVar.a("TCF client enabled.");
            tkc.l(hrcVar);
            hrcVar.g();
            thc thcVar11110 = tkcVar3.f;
            tkc.m(thcVar11110);
            thcVar11110.m.a("Register tcfPrefChangeListener.");
            if (hrcVar.t == null) {
                hrcVar.u = new voc(hrcVar, tkcVar3);
                hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                        hrc hrcVar2 = hrcVar;
                        hrcVar2.getClass();
                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                            thc thcVar11111 = hrcVar2.a.f;
                            tkc.m(thcVar11111);
                            thcVar11111.n.a("IABTCF_TCString change picked up in listener.");
                            voc vocVar = hrcVar2.u;
                            a78.g(vocVar);
                            vocVar.b(500L);
                        }
                    }
                };
            }
            zic zicVar19 = tkcVar3.e;
            tkc.k(zicVar19);
            zicVar19.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
            tkc.l(hrcVar);
            hrcVar.m();
        } else {
            tkc.m(thcVar);
            phcVar.a("TCF client enabled.");
            tkc.l(hrcVar);
            hrcVar.g();
            thc thcVar11111 = tkcVar3.f;
            tkc.m(thcVar11111);
            thcVar11111.m.a("Register tcfPrefChangeListener.");
            if (hrcVar.t == null) {
                hrcVar.u = new voc(hrcVar, tkcVar3);
                hrcVar.t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xqc
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                        hrc hrcVar2 = hrcVar;
                        hrcVar2.getClass();
                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                            thc thcVar11112 = hrcVar2.a.f;
                            tkc.m(thcVar11112);
                            thcVar11112.n.a("IABTCF_TCString change picked up in listener.");
                            voc vocVar = hrcVar2.u;
                            a78.g(vocVar);
                            vocVar.b(500L);
                        }
                    }
                };
            }
            zic zicVar110 = tkcVar3.e;
            tkc.k(zicVar110);
            zicVar110.l().registerOnSharedPreferenceChangeListener(hrcVar.t);
            tkc.l(hrcVar);
            hrcVar.m();
        }
        ticVar = zicVar.f;
        if (ticVar.a() == 0) {
            tkc.m(thcVar);
            phcVar3.b(Long.valueOf(j), "Persisting first open");
            ticVar.b(j);
        }
        tkc.l(hrcVar);
        s7dVar = hrcVar.q;
        if (s7dVar.c()) {
            zic zicVar111 = s7dVar.a.e;
            tkc.k(zicVar111);
            zicVar111.w.b(null);
        }
        if (tkcVar2.h()) {
            if (tkcVar2.d()) {
                yzcVar2 = yzcVar;
                if (yzcVar2.K("android.permission.INTERNET")) {
                    tkc.m(thcVar);
                    phcVar6 = phcVar5;
                    phcVar6.a("App is missing INTERNET permission");
                } else {
                    phcVar6 = phcVar5;
                }
                if (!yzcVar2.K("android.permission.ACCESS_NETWORK_STATE")) {
                    tkc.m(thcVar);
                    phcVar6.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                tkcVar4 = tkcVar2;
                context = tkcVar4.a;
                if (!wqb.a(context).c()) {
                    if (!yzc.c0(context)) {
                        tkc.m(thcVar);
                        phcVar6.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!yzc.B(context)) {
                        tkc.m(thcVar);
                        phcVar6.a("AppMeasurementService not registered/enabled");
                    }
                }
                tkc.m(thcVar);
                phcVar6.a("Uploading is not possible. App measurement disabled");
            } else {
                tkcVar4 = tkcVar2;
                yzcVar2 = yzcVar;
            }
            thcVar2 = thcVar;
        } else {
            tkcVar4 = tkcVar2;
            yzcVar2 = yzcVar;
            if (TextUtils.isEmpty(tkcVar4.r().n())) {
                String strN13 = tkcVar4.r().n();
                zicVar.g();
                String string8 = zicVar.k().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strN13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                if (zIsEmpty) {
                    xicVar2 = xicVar;
                } else {
                    xicVar2 = xicVar;
                }
                String strN14 = tkcVar4.r().n();
                zicVar.g();
                SharedPreferences.Editor editorEdit10 = zicVar.k().edit();
                editorEdit10.putString("gmp_app_id", strN14);
                editorEdit10.apply();
            } else {
                xicVar2 = xicVar;
            }
            if (!zicVar.n().i(lncVar)) {
                xicVar2.b(null);
            }
            tkc.l(hrcVar);
            hrcVar.g.set(xicVar2.a());
            tkcVar6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            thcVar2 = thcVar;
            if (!TextUtils.isEmpty(tkcVar4.r().n())) {
                zD = tkcVar4.d();
                sharedPreferences = zicVar.c;
                if (sharedPreferences == null) {
                    zContains = z2;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    zicVar.o(!zD);
                }
                if (zD) {
                    tkc.l(hrcVar);
                    hrcVar.s();
                }
                cxc cxcVar8 = tkcVar4.h;
                tkc.l(cxcVar8);
                cxcVar8.e.a();
                tkcVar4.p().k(new AtomicReference());
                tkcVar4.p().l(zicVar.y.a());
            }
        }
        o6c.a();
        if (t7cVar.r(null, wfc.P0)) {
            yzcVar2.g();
            if (yzcVar2.E() == 1) {
                long jIntValue8 = ((Integer) wfc.w0.a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                tkcVar4.k.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    tkc.m(thcVar2);
                    phcVar3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                tkc.l(hrcVar);
                hrcVar.g();
                if (hrcVar.l == null) {
                    hrcVar.l = new boc(hrcVar, tkcVar3);
                }
                hrcVar.l.b(jMax);
            }
        }
        zicVar.o.b(true);
    }
}
