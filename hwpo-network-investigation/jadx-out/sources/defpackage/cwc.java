package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cwc implements vxc {
    public final String t;
    public final ozc u;

    public cwc(String str, ozc ozcVar) {
        this.t = str;
        this.u = ozcVar;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l5a
    public final Object get() {
        mzc mzcVarA;
        Object objA;
        ep9 ep9Var;
        boolean z;
        lrc lrcVar;
        if (bsc.v == null) {
            Object obj = lrc.j;
            bsc.v = new zrc();
        }
        Context context = (Context) lrc.k.get();
        Object objC = null;
        if (context == null) {
            synchronized (bsc.t) {
            }
            aa0.c("Must call PhenotypeContext.setContext() first");
            return null;
        }
        final lrc lrcVar2 = lrc.l;
        if (lrcVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Object applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                if (!(applicationContext2 instanceof r4c)) {
                    Class<?> cls = applicationContext2.getClass();
                    new StringBuilder(String.valueOf(cls).length() + 72);
                    cls.toString();
                    throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                }
                try {
                    Object objCast = jrc.class.cast(((r4c) applicationContext2).a());
                    objCast.getClass();
                    sk7 sk7VarA = ((jrc) objCast).a();
                    try {
                        if (sk7VarA.b()) {
                            lrcVar2 = (lrc) sk7VarA.a();
                        } else {
                            z = true;
                        }
                    } catch (IllegalStateException unused) {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
                }
            } catch (IllegalStateException unused2) {
                z = false;
            }
            synchronized (lrc.j) {
                try {
                    if (lrc.l != null) {
                        lrcVar = lrc.l;
                    } else {
                        sk7 sk7VarA2 = f0.t;
                        boolean z2 = applicationContext instanceof jrc;
                        if (z2) {
                            sk7VarA2 = ((jrc) applicationContext).a();
                        }
                        lrcVar = (lrc) sk7VarA2.c(new nrc(applicationContext));
                        lrc.l = lrcVar;
                        if (!z && !z2) {
                            nsc.a(Level.CONFIG, lrcVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lrcVar2 = lrcVar;
        }
        hxc hxcVar = (hxc) this;
        int i = hxcVar.v;
        if (i == -1 || i < hxcVar.w.a.get()) {
            synchronized (hxcVar) {
                try {
                    int i2 = hxcVar.v;
                    if (i2 == -1) {
                        lrc.b();
                        lrcVar2.getClass();
                        mzcVarA = hxcVar.u.a(lrcVar2);
                        hxcVar.w = mzcVarA.g;
                    } else {
                        mzcVarA = null;
                    }
                    int i3 = hxcVar.w.a.get();
                    if (i2 < i3) {
                        lrc.b();
                        lrcVar2.getClass();
                        sk7 sk7VarA3 = arc.a(lrcVar2.b);
                        if (sk7VarA3.b()) {
                            yqc yqcVar = (yqc) sk7VarA3.a();
                            Uri uriA = crc.a();
                            String str = hxcVar.t;
                            if (uriA != null) {
                                ep9Var = (ep9) yqcVar.a.get(uriA.toString());
                            } else {
                                yqcVar.getClass();
                                ep9Var = null;
                            }
                            String str2 = ep9Var == null ? null : (String) ep9Var.get(str);
                            if (str2 == null) {
                                objA = null;
                            } else {
                                try {
                                    objA = hxcVar.b(str2);
                                } catch (IOException | IllegalArgumentException e2) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(hxcVar.t), e2);
                                    objA = null;
                                }
                            }
                        } else {
                            objA = null;
                        }
                        if (mzcVarA == null) {
                            mzcVarA = hxcVar.u.a(lrcVar2);
                        }
                        final String str3 = mzcVarA.c;
                        if (Build.VERSION.SDK_INT >= 26 && !lrcVar2.b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture<?> listenableFutureSubmit = lrcVar2.a().submit(new Runnable() { // from class: wzc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context2 = lrcVar2.b;
                                    vl8 vl8Var = zzc.c;
                                    if (vl8Var == null) {
                                        synchronized (zzc.b) {
                                            vl8Var = zzc.c;
                                            if (vl8Var == null) {
                                                m95.a aVarA = m95.a();
                                                try {
                                                    String[] list = context2.getAssets().list("phenotype");
                                                    if (list != null) {
                                                        for (String str4 : list) {
                                                            if (str4.endsWith("_package_metadata.binarypb")) {
                                                                try {
                                                                    AssetManager assets = context2.getAssets();
                                                                    StringBuilder sb = new StringBuilder(str4.length() + 10);
                                                                    sb.append("phenotype/");
                                                                    sb.append(str4);
                                                                    InputStream inputStreamOpen = assets.open(sb.toString());
                                                                    try {
                                                                        f1c f1cVar = f1c.b;
                                                                        int i4 = h0c.a;
                                                                        zzc zzcVar = new zzc(context2, a0d.z(inputStreamOpen, f1c.c));
                                                                        aVarA.b(zzcVar.a, zzcVar);
                                                                        if (inputStreamOpen != null) {
                                                                            inputStreamOpen.close();
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        if (inputStreamOpen != null) {
                                                                            try {
                                                                                inputStreamOpen.close();
                                                                            } catch (Throwable th3) {
                                                                                th2.addSuppressed(th3);
                                                                            }
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (k2c e3) {
                                                                    StringBuilder sb2 = new StringBuilder(str4.length() + 45);
                                                                    sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                                    sb2.append(str4);
                                                                    Log.e("PackageInfo", sb2.toString(), e3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (IOException e4) {
                                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e4);
                                                }
                                                vl8 vl8VarA = aVarA.a(true);
                                                zzc.c = vl8VarA;
                                                vl8Var = vl8VarA;
                                            }
                                        }
                                    }
                                    String str5 = str3;
                                    if (vl8Var.containsKey(str5)) {
                                        return;
                                    }
                                    StringBuilder sb3 = new StringBuilder(str5.length() + 173);
                                    sb3.append("Config package ");
                                    sb3.append(str5);
                                    sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                                    Log.e("FilePhenotypeFlags", sb3.toString());
                                }
                            });
                            listenableFutureSubmit.Q(new f0d(listenableFutureSubmit), y03.t);
                        }
                        Object obj2 = mzcVarA.a().d.get(hxcVar.t);
                        if (obj2 != null) {
                            try {
                                objC = hxcVar.c(obj2);
                            } catch (IOException | ClassCastException e3) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(hxcVar.t), e3);
                            }
                        }
                        if (true != sk7VarA3.b()) {
                            objA = objC;
                        }
                        if (objA == null) {
                            objA = hxcVar.a();
                        }
                        if (objA != null) {
                            hxcVar.e(objA);
                            hxcVar.v = i3;
                        }
                    } else {
                        objA = hxcVar.d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objA = hxcVar.d();
        }
        objA.getClass();
        return objA;
    }
}
