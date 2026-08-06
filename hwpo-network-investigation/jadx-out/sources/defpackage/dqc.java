package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dqc implements Runnable {
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Uri u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ fqc x;

    public dqc(fqc fqcVar, boolean z, Uri uri, String str, String str2) {
        this.t = z;
        this.u = uri;
        this.v = str;
        this.w = str2;
        this.x = fqcVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[Catch: RuntimeException -> 0x0085, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0107 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0129 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x012f A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a7, B:37:0x00b2, B:40:0x00bf, B:42:0x00c5, B:44:0x00df, B:46:0x00e8, B:48:0x00ee, B:51:0x0107, B:53:0x0116, B:52:0x010e, B:55:0x0129, B:57:0x012f, B:59:0x0135, B:61:0x013b, B:63:0x0141, B:65:0x0149, B:67:0x0151, B:69:0x0157, B:71:0x0169, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        thc thcVar;
        Bundle bundleI0;
        boolean z;
        String str;
        thc thcVar2;
        phc phcVar;
        Bundle bundleI1;
        fqc fqcVar = this.x;
        hrc hrcVar = fqcVar.t;
        hrcVar.g();
        tkc tkcVar = hrcVar.a;
        s7d s7dVar = hrcVar.q;
        String str2 = this.w;
        Uri uri = this.u;
        try {
            yzc yzcVar = tkcVar.i;
            thc thcVar3 = tkcVar.f;
            tkc.k(yzcVar);
            String str3 = "Activity created with data 'referrer' without required params";
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (!str2.contains("gclid")) {
                        thcVar = thcVar3;
                        if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                            thc thcVar4 = yzcVar.a.f;
                            tkc.m(thcVar4);
                            thcVar4.m.a("Activity created with data 'referrer' without required params");
                        }
                        z = this.t;
                        str = this.v;
                        if (z) {
                            yzc yzcVar2 = tkcVar.i;
                            tkc.k(yzcVar2);
                            bundleI1 = yzcVar2.i0(uri);
                            if (bundleI1 != null) {
                                bundleI1.putString("_cis", "intent");
                                if (bundleI1.containsKey("gclid") && bundleI0 != null && bundleI0.containsKey("gclid")) {
                                    bundleI1.putString("_cer", "gclid=" + bundleI0.getString("gclid"));
                                }
                                hrcVar.n(str, "_cmp", bundleI1);
                                s7dVar.a(bundleI1, str);
                            } else {
                                str3 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str3 = "Activity created with data 'referrer' without required params";
                        }
                        if (TextUtils.isEmpty(str2)) {
                        }
                        tkc.m(thcVar);
                        thcVar2 = thcVar;
                        phcVar = thcVar2.m;
                        phcVar.b(str2, "Activity created with referrer");
                        if (tkcVar.d.r(null, wfc.G0)) {
                            if (bundleI0 != null) {
                                hrcVar.n(str, "_cmp", bundleI0);
                                s7dVar.a(bundleI0, str);
                            } else {
                                tkc.m(thcVar2);
                                phcVar.b(str2, "Referrer does not contain valid parameters");
                            }
                            tkcVar.k.getClass();
                            hrcVar.q("auto", "_ldl", null, true, System.currentTimeMillis());
                        }
                        if (str2.contains("gclid") || !(str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                            tkc.m(thcVar2);
                            phcVar.a(str3);
                            return;
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            tkcVar.k.getClass();
                            hrcVar.q("auto", "_ldl", str2, true, System.currentTimeMillis());
                            return;
                        }
                    }
                    thcVar = thcVar3;
                    bundleI0 = yzcVar.i0(Uri.parse("https://google.com/search?".concat(str2)));
                    if (bundleI0 != null) {
                        bundleI0.putString("_cis", "referrer");
                    }
                    z = this.t;
                    str = this.v;
                    if (z) {
                        yzc yzcVar3 = tkcVar.i;
                        tkc.k(yzcVar3);
                        bundleI1 = yzcVar3.i0(uri);
                        if (bundleI1 != null) {
                            bundleI1.putString("_cis", "intent");
                            if (bundleI1.containsKey("gclid")) {
                            }
                            hrcVar.n(str, "_cmp", bundleI1);
                            s7dVar.a(bundleI1, str);
                        } else {
                            str3 = "Activity created with data 'referrer' without required params";
                        }
                    } else {
                        str3 = "Activity created with data 'referrer' without required params";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        tkc.m(thcVar);
                        thcVar2 = thcVar;
                        phcVar = thcVar2.m;
                        phcVar.b(str2, "Activity created with referrer");
                        if (tkcVar.d.r(null, wfc.G0)) {
                            if (str2.contains("gclid")) {
                            }
                            tkc.m(thcVar2);
                            phcVar.a(str3);
                            return;
                        }
                        if (bundleI0 != null) {
                            hrcVar.n(str, "_cmp", bundleI0);
                            s7dVar.a(bundleI0, str);
                        } else {
                            tkc.m(thcVar2);
                            phcVar.b(str2, "Referrer does not contain valid parameters");
                        }
                        tkcVar.k.getClass();
                        hrcVar.q("auto", "_ldl", null, true, System.currentTimeMillis());
                    }
                } catch (RuntimeException e) {
                    e = e;
                    thc thcVar5 = fqcVar.t.a.f;
                    tkc.m(thcVar5);
                    thcVar5.f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
            }
            thcVar = thcVar3;
            bundleI0 = null;
            z = this.t;
            str = this.v;
            if (z) {
                yzc yzcVar4 = tkcVar.i;
                tkc.k(yzcVar4);
                bundleI1 = yzcVar4.i0(uri);
                if (bundleI1 != null) {
                    bundleI1.putString("_cis", "intent");
                    if (bundleI1.containsKey("gclid")) {
                    }
                    hrcVar.n(str, "_cmp", bundleI1);
                    s7dVar.a(bundleI1, str);
                } else {
                    str3 = "Activity created with data 'referrer' without required params";
                }
            } else {
                str3 = "Activity created with data 'referrer' without required params";
            }
            if (TextUtils.isEmpty(str2)) {
                tkc.m(thcVar);
                thcVar2 = thcVar;
                phcVar = thcVar2.m;
                phcVar.b(str2, "Activity created with referrer");
                if (tkcVar.d.r(null, wfc.G0)) {
                    if (str2.contains("gclid")) {
                    }
                    tkc.m(thcVar2);
                    phcVar.a(str3);
                    return;
                }
                if (bundleI0 != null) {
                    hrcVar.n(str, "_cmp", bundleI0);
                    s7dVar.a(bundleI0, str);
                } else {
                    tkc.m(thcVar2);
                    phcVar.b(str2, "Referrer does not contain valid parameters");
                }
                tkcVar.k.getClass();
                hrcVar.q("auto", "_ldl", null, true, System.currentTimeMillis());
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
    }
}
