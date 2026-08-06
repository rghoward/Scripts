package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.intercom.twig.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ti implements si {
    public static volatile ti c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public ti(AppMeasurementSdk appMeasurementSdk) {
        a78.g(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.si
    public final Map<String, Object> a(boolean z) {
        return this.a.a.a(null, null, z);
    }

    @Override // defpackage.si
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.a.a.f("frc", BuildConfig.FLAVOR)) {
            q95 q95Var = tac.a;
            a78.g(bundle);
            si.a aVar = new si.a();
            String str = (String) uma.d(bundle, "origin", String.class, null);
            a78.g(str);
            aVar.a = str;
            String str2 = (String) uma.d(bundle, "name", String.class, null);
            a78.g(str2);
            aVar.b = str2;
            aVar.c = uma.d(bundle, "value", Object.class, null);
            aVar.d = (String) uma.d(bundle, "trigger_event_name", String.class, null);
            aVar.e = ((Long) uma.d(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f = (String) uma.d(bundle, "timed_out_event_name", String.class, null);
            aVar.g = (Bundle) uma.d(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.h = (String) uma.d(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) uma.d(bundle, "triggered_event_params", Bundle.class, null);
            aVar.j = ((Long) uma.d(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.k = (String) uma.d(bundle, "expired_event_name", String.class, null);
            aVar.l = (Bundle) uma.d(bundle, "expired_event_params", Bundle.class, null);
            aVar.n = ((Boolean) uma.d(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.m = ((Long) uma.d(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.o = ((Long) uma.d(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // defpackage.si
    public final er5 c(String str, r82 r82Var) {
        Object ggcVar;
        if (tac.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (zEquals) {
                    ggcVar = new hdc(appMeasurementSdk, r82Var);
                } else {
                    ggcVar = "clx".equals(str) ? new ggc(appMeasurementSdk, r82Var) : null;
                }
                if (ggcVar != null) {
                    concurrentHashMap.put(str, ggcVar);
                    return new er5();
                }
            }
        }
        return null;
    }

    @Override // defpackage.si
    public final void d(si.a aVar) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        q95 q95Var = tac.a;
        String str = aVar.a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = aVar.c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = object;
                            if (obj2 == null) {
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (tac.a(str) && tac.c(str, aVar.b)) {
            String str2 = aVar.k;
            if (str2 == null || (tac.b(aVar.l, str2) && tac.d(str, aVar.k, aVar.l))) {
                String str3 = aVar.h;
                if (str3 == null || (tac.b(aVar.i, str3) && tac.d(str, aVar.h, aVar.i))) {
                    String str4 = aVar.f;
                    if (str4 == null || (tac.b(aVar.g, str4) && tac.d(str, aVar.f, aVar.g))) {
                        Bundle bundle = new Bundle();
                        String str5 = aVar.a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = aVar.b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj3 = aVar.c;
                        if (obj3 != null) {
                            uma.c(bundle, obj3);
                        }
                        String str7 = aVar.d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", aVar.e);
                        String str8 = aVar.f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = aVar.g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = aVar.h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = aVar.i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", aVar.j);
                        String str10 = aVar.k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = aVar.l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", aVar.m);
                        bundle.putBoolean("active", aVar.n);
                        bundle.putLong("triggered_timestamp", aVar.o);
                        mec mecVar = this.a.a;
                        mecVar.c(new occ(mecVar, bundle));
                    }
                }
            }
        }
    }

    @Override // defpackage.si
    public final void e(String str, String str2, Bundle bundle) {
        if (tac.a(str) && tac.b(bundle, str2) && tac.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    @Override // defpackage.si
    public final int f() {
        return this.a.a.b("frc");
    }

    @Override // defpackage.si
    public final void g(String str) {
        mec mecVar = this.a.a;
        mecVar.c(new pcc(mecVar, str, null, null));
    }

    @Override // defpackage.si
    public final void h(String str) {
        if (tac.a("fcm") && tac.c("fcm", "_ln")) {
            mec mecVar = this.a.a;
            mecVar.c(new ncc(mecVar, str));
        }
    }
}
