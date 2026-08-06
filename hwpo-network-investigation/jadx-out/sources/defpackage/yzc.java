package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import io.ably.lib.rest.Auth;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yzc extends cnc {
    public static final String[] i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public pl6.a f;
    public Boolean g;
    public Integer h;

    public yzc(tkc tkcVar) {
        super(tkcVar);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    public static long A(byte[] bArr) {
        a78.g(bArr);
        int length = bArr.length;
        long j2 = 0;
        if (length <= 0) {
            d43.c();
            return 0L;
        }
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (((long) bArr[i3]) & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean B(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static int D() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean F(int i2, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    public static boolean I(String str, String[] strArr) {
        a78.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean J(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(Auth.WILDCARD_CLIENTID) || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean L(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] Q(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList b0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e5c e5cVar = (e5c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", e5cVar.t);
            bundle.putString("origin", e5cVar.u);
            bundle.putLong("creation_timestamp", e5cVar.w);
            bundle.putString("name", e5cVar.v.u);
            Object objJ = e5cVar.v.j();
            a78.g(objJ);
            uma.c(bundle, objJ);
            bundle.putBoolean("active", e5cVar.x);
            String str = e5cVar.y;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            z9c z9cVar = e5cVar.z;
            if (z9cVar != null) {
                bundle.putString("timed_out_event_name", z9cVar.t);
                v9c v9cVar = z9cVar.u;
                if (v9cVar != null) {
                    bundle.putBundle("timed_out_event_params", v9cVar.v());
                }
            }
            bundle.putLong("trigger_timeout", e5cVar.A);
            z9c z9cVar2 = e5cVar.B;
            if (z9cVar2 != null) {
                bundle.putString("triggered_event_name", z9cVar2.t);
                v9c v9cVar2 = z9cVar2.u;
                if (v9cVar2 != null) {
                    bundle.putBundle("triggered_event_params", v9cVar2.v());
                }
            }
            bundle.putLong("triggered_timestamp", e5cVar.v.v);
            bundle.putLong("time_to_live", e5cVar.C);
            z9c z9cVar3 = e5cVar.D;
            if (z9cVar3 != null) {
                bundle.putString("expired_event_name", z9cVar3.t);
                v9c v9cVar3 = z9cVar3.u;
                if (v9cVar3 != null) {
                    bundle.putBundle("expired_event_params", v9cVar3.v());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        a78.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void d0(dsc dscVar, Bundle bundle, boolean z) {
        if (bundle != null && dscVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = dscVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = dscVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", dscVar.c);
                return;
            }
            z = false;
        }
        if (bundle != null && dscVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean h0(String str) {
        a78.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean j0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String n(int i2, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i2)).concat("...");
        }
        return null;
    }

    public static boolean t0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void y(xzc xzcVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        F(i2, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        xzcVar.a(str, "_err", bundle);
    }

    public static MessageDigest z() {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public final pl6 C() {
        ln4 nl6Var;
        if (this.f == null) {
            Context context = this.a.a;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i2 = Build.VERSION.SDK_INT;
            ua uaVar = ua.a;
            sb.append(i2 >= 33 ? uaVar.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i2 >= 33 ? uaVar.a() : 0) >= 5) {
                nl6Var = new ol6(context);
            } else {
                ta taVar = ta.a;
                if (((i2 == 31 || i2 == 32) ? taVar.a() : 0) >= 9) {
                    try {
                        nl6Var = new nl6(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i3 = Build.VERSION.SDK_INT;
                        sb2.append((i3 == 31 || i3 == 32) ? taVar.a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        nl6Var = null;
                    }
                } else {
                    nl6Var = null;
                }
            }
            this.f = nl6Var != null ? new pl6.a(nl6Var) : null;
        }
        return this.f;
    }

    public final long E() {
        long j2;
        boolean zBooleanValue;
        Integer num;
        Object e;
        g();
        tkc tkcVar = this.a;
        wgc wgcVarR = tkcVar.r();
        thc thcVar = tkcVar.f;
        if (!J((String) wfc.q0.a(null), wgcVarR.m())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j2 = 8;
        } else {
            j2 = D() < ((Integer) wfc.k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!K("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0) {
            if (this.g == null) {
                pl6 pl6VarC = C();
                zBooleanValue = false;
                if (pl6VarC != null) {
                    try {
                        num = pl6VarC.a().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                tkc.m(thcVar);
                                thcVar.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            } catch (CancellationException e3) {
                                e = e3;
                                tkc.m(thcVar);
                                thcVar.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            } catch (ExecutionException e4) {
                                e = e4;
                                tkc.m(thcVar);
                                thcVar.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            } catch (TimeoutException e5) {
                                e = e5;
                                tkc.m(thcVar);
                                thcVar.i.b(e, "Measurement manager api exception");
                                this.g = Boolean.FALSE;
                            }
                        }
                        this.g = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        num = null;
                        e = e6;
                    }
                    tkc.m(thcVar);
                    thcVar.n.b(num, "Measurement manager api status result");
                    zBooleanValue = this.g.booleanValue();
                }
            } else {
                zBooleanValue = this.g.booleanValue();
            }
            if (!zBooleanValue) {
                j2 = 64;
            }
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final Object G(int i2, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return n(i2, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleN = N((Bundle) parcelable);
                if (!bundleN.isEmpty()) {
                    arrayList.add(bundleN);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int H(String str) {
        boolean zEquals = "_ldl".equals(str);
        tkc tkcVar = this.a;
        if (zEquals) {
            tkcVar.getClass();
            return AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        }
        if ("_id".equals(str)) {
            tkcVar.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            tkcVar.getClass();
            return 100;
        }
        tkcVar.getClass();
        return 36;
    }

    public final boolean K(String str) {
        g();
        tkc tkcVar = this.a;
        if (wqb.a(tkcVar.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.b(str, "Permission not granted");
        return false;
    }

    public final boolean M(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.a.d.k("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle N(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objP = p(bundle.get(str), str);
                if (objP == null) {
                    tkc tkcVar = this.a;
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.k.b(tkcVar.j.b(str), "Param value can't be null");
                } else {
                    x(bundle2, str, objP);
                }
            }
        }
        return bundle2;
    }

    public final z9c O(String str, Bundle bundle, String str2, long j2, long j3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (o0(str) != 0) {
            tkc tkcVar = this.a;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(tkcVar.j.c(str), "Invalid conditional property event name");
            zn3.b();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleQ = q(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleQ = N(bundleQ);
        }
        a78.g(bundleQ);
        return new z9c(str, new v9c(bundleQ), str2, j2, j3);
    }

    public final boolean P(Context context, String str) {
        Signature[] signatureArr;
        tkc tkcVar = this.a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = wqb.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean R(int i2) {
        Boolean bool = this.a.p().e;
        if (S() < i2 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int S() {
        if (this.h == null) {
            xn4 xn4Var = xn4.b;
            Context context = this.a.a;
            xn4Var.getClass();
            AtomicBoolean atomicBoolean = co4.a;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.h = Integer.valueOf(i2 / 1000);
        }
        return this.h.intValue();
    }

    public final void T(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(Long.valueOf(j3), "Params already contained engagement");
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void U(String str, obc obcVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning string value to wrapper");
        }
    }

    public final void V(obc obcVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning long value to wrapper");
        }
    }

    public final void W(obc obcVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning int value to wrapper");
        }
    }

    public final void X(obc obcVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void Y(obc obcVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void Z(obc obcVar, Bundle bundle) {
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void a0(obc obcVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            obcVar.D(bundle);
        } catch (RemoteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String e0() {
        byte[] bArr = new byte[16];
        g0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long f0() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            this.a.k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            j2 = jNextLong + ((long) i2);
        }
        return j2;
    }

    public final SecureRandom g0() {
        g();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    @Override // defpackage.cnc
    public final boolean h() {
        return true;
    }

    public final Bundle i0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        tkc tkcVar = this.a;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (tkcVar.d.r(null, wfc.a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        tkcVar.d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = n(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.i.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean k(String str, String str2, int i2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i2) {
            return true;
        }
        thc thcVar = this.a.f;
        tkc.m(thcVar);
        thcVar.k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    public final boolean k0(String str, String str2) {
        tkc tkcVar = this.a;
        if (str2 == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.h.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                thc thcVar4 = tkcVar.f;
                tkc.m(thcVar4);
                thcVar4.h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void l(String str, String str2, Bundle bundle, List list, boolean z) {
        int iR0;
        int iO;
        list = list;
        if (bundle == null) {
            return;
        }
        tkc tkcVar = this.a;
        t7c t7cVar = tkcVar.d;
        thc thcVar = tkcVar.f;
        fhc fhcVar = tkcVar.j;
        yzc yzcVar = t7cVar.a.i;
        tkc.k(yzcVar);
        int i2 = true != yzcVar.R(231100000) ? 0 : 35;
        int i3 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iR0 = !z ? r0(str3) : 0;
                if (iR0 == 0) {
                    iR0 = s0(str3);
                }
            } else {
                iR0 = 0;
            }
            if (iR0 != 0) {
                u(bundle, iR0, str3, iR0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (t0(bundle.get(str3))) {
                    tkc.m(thcVar);
                    thcVar.k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iO = 22;
                } else {
                    iO = o(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iO != 0 && !"_ev".equals(str3)) {
                    u(bundle, iO, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (h0(str3) && !I(str3, m40.d)) {
                    i3++;
                    if (!R(231100000)) {
                        tkc.m(thcVar);
                        thcVar.h.c(fhcVar.a(str), fhcVar.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        F(23, bundle);
                        bundle.remove(str3);
                    } else if (i3 > i2) {
                        if (!z2) {
                            tkc.m(thcVar);
                            phc phcVar = thcVar.h;
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i2);
                            sb.append(" item-scoped custom params");
                            phcVar.c(fhcVar.a(str), fhcVar.e(bundle), sb.toString());
                        }
                        F(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final boolean l0(String str, String str2) {
        tkc tkcVar = this.a;
        if (str2 == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                thc thcVar3 = tkcVar.f;
                tkc.m(thcVar3);
                thcVar3.h.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                thc thcVar4 = tkcVar.f;
                tkc.m(thcVar4);
                thcVar4.h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean m(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        tkc tkcVar = this.a;
        if (zIsEmpty) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        a78.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar2);
        thcVar2.h.b(thc.o(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean m0(String str, String[] strArr, String[] strArr2, String str2) {
        tkc tkcVar = this.a;
        if (str2 == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(i[i2])) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.h.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !I(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && I(str2, strArr2)) {
            return true;
        }
        thc thcVar3 = tkcVar.f;
        tkc.m(thcVar3);
        thcVar3.h.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean n0(int i2, String str, String str2) {
        tkc tkcVar = this.a;
        if (str2 == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar2);
        thcVar2.h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public final int o(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i2;
        int size;
        g();
        boolean zT0 = t0(obj);
        tkc tkcVar = this.a;
        int i3 = 0;
        if (!zT0) {
            i2 = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!I(str2, m40.c)) {
                return 20;
            }
            tvc tvcVarP = tkcVar.p();
            tvcVarP.g();
            tvcVarP.h();
            if (tvcVarP.n()) {
                yzc yzcVar = tvcVarP.a.i;
                tkc.k(yzcVar);
                if (yzcVar.S() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i2 = 0;
            }
            if (size > 200) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.k.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i2 = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i2 = 0;
            }
        }
        int iMax = 500;
        if (L(str) || L(str2)) {
            tkcVar.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            tkcVar.d.getClass();
        }
        if (!k("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                l(str, str2, (Bundle) obj, list, z);
                return i2;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i3 < length) {
                    Parcelable parcelable = parcelableArr2[i3];
                    if (!(parcelable instanceof Bundle)) {
                        thc thcVar2 = tkcVar.f;
                        tkc.m(thcVar2);
                        thcVar2.k.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    l(str, str2, (Bundle) parcelable, list, z);
                    i3++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    if (!(obj2 instanceof Bundle)) {
                        thc thcVar3 = tkcVar.f;
                        tkc.m(thcVar3);
                        thcVar3.k.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    l(str, str2, (Bundle) obj2, list, z);
                    i3++;
                }
            }
        }
        return i2;
    }

    public final int o0(String str) {
        if (!l0("event", str)) {
            return 2;
        }
        if (m0("event", oh7.a, this.a.d.r(null, wfc.f1) ? oh7.c : oh7.b, str)) {
            return !n0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final Object p(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = 500;
        tkc tkcVar = this.a;
        if (zEquals) {
            tkcVar.d.getClass();
            return G(Math.max(500, 256), obj, true, true);
        }
        if (L(str)) {
            tkcVar.d.getClass();
            iMax = Math.max(500, 256);
        } else {
            tkcVar.d.getClass();
        }
        return G(iMax, obj, false, true);
    }

    public final boolean p0(String str) {
        return this.a.d.r(null, wfc.f1) ? I(str, oh7.e) : I(str, oh7.d);
    }

    public final Bundle q(String str, Bundle bundle, List list, boolean z) {
        int iR0;
        boolean zI = I(str, oh7.g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        tkc tkcVar = this.a;
        t7c t7cVar = tkcVar.d;
        fhc fhcVar = tkcVar.j;
        yzc yzcVar = t7cVar.a.i;
        tkc.k(yzcVar);
        int i2 = yzcVar.R(201500000) ? 100 : 25;
        int i3 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iR0 = !z ? r0(str2) : 0;
                if (iR0 == 0) {
                    iR0 = s0(str2);
                }
            } else {
                iR0 = 0;
            }
            if (iR0 != 0) {
                u(bundle2, iR0, str2, iR0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iO = o(str, str2, bundle.get(str2), bundle2, list, z, zI);
                if (iO == 17) {
                    u(bundle2, 17, str2, Boolean.FALSE);
                } else if (iO != 0 && !"_ev".equals(str2)) {
                    u(bundle2, iO, iO == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (h0(str2)) {
                    i3++;
                    if (i3 > i2) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i2);
                            sb.append(" params");
                            String string = sb.toString();
                            thc thcVar = tkcVar.f;
                            tkc.m(thcVar);
                            thcVar.h.c(fhcVar.a(str), fhcVar.e(bundle), string);
                        }
                        F(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int q0(String str) {
        if (!l0("user property", str)) {
            return 6;
        }
        if (!m0("user property", bw5.b, null, str)) {
            return 15;
        }
        this.a.getClass();
        return !n0(24, "user property", str) ? 6 : 0;
    }

    public final void r(vhc vhcVar, int i2) {
        Bundle bundle = vhcVar.e;
        int i3 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (h0(str) && (i3 = i3 + 1) > i2) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i2);
                    sb.append(" params");
                    String string = sb.toString();
                    tkc tkcVar = this.a;
                    thc thcVar = tkcVar.f;
                    fhc fhcVar = tkcVar.j;
                    tkc.m(thcVar);
                    thcVar.h.c(fhcVar.a(vhcVar.a), fhcVar.e(bundle), string);
                    F(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int r0(String str) {
        if (!k0("event param", str)) {
            return 3;
        }
        if (!m0("event param", null, null, str)) {
            return 14;
        }
        this.a.getClass();
        return !n0(40, "event param", str) ? 3 : 0;
    }

    public final void s(Parcelable[] parcelableArr, int i2) {
        a78.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (h0(str) && !I(str, m40.d) && (i3 = i3 + 1) > i2) {
                    if (!z) {
                        tkc tkcVar = this.a;
                        thc thcVar = tkcVar.f;
                        fhc fhcVar = tkcVar.j;
                        tkc.m(thcVar);
                        phc phcVar = thcVar.h;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i2);
                        sb.append(" item-scoped custom parameters");
                        phcVar.c(fhcVar.b(str), fhcVar.e(bundle), sb.toString());
                    }
                    F(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final int s0(String str) {
        if (!l0("event param", str)) {
            return 3;
        }
        if (!m0("event param", null, null, str)) {
            return 14;
        }
        this.a.getClass();
        return !n0(40, "event param", str) ? 3 : 0;
    }

    public final void t(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                yzc yzcVar = this.a.i;
                tkc.k(yzcVar);
                yzcVar.x(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void u(Bundle bundle, int i2, String str, Object obj) {
        if (F(i2, bundle)) {
            this.a.getClass();
            bundle.putString("_ev", n(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int v(Object obj, String str) {
        return "_ldl".equals(str) ? k("user property referrer", str, H(str), obj) : k("user property", str, H(str), obj) ? 0 : 7;
    }

    public final Object w(Object obj, String str) {
        return "_ldl".equals(str) ? G(H(str), obj, true, false) : G(H(str), obj, false, false);
    }

    public final void x(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            tkc tkcVar = this.a;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.k.c(tkcVar.j.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }
}
