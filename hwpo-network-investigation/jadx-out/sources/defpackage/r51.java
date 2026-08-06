package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.intercom.twig.BuildConfig;
import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.models.AttributeType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r51 implements dxa {
    public final cm5 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final uf1 e;
    public final uf1 f;
    public final int g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final URL a;
        public final uc0 b;
        public final String c;

        public a(URL url, uc0 uc0Var, String str) {
            this.a = url;
            this.b = uc0Var;
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public r51(Context context, uf1 uf1Var, uf1 uf1Var2) {
        dm5 dm5Var = new dm5();
        la0 la0Var = la0.a;
        dm5Var.a(sn0.class, la0Var);
        dm5Var.a(uc0.class, la0Var);
        sa0 sa0Var = sa0.a;
        dm5Var.a(td6.class, sa0Var);
        dm5Var.a(me0.class, sa0Var);
        ma0 ma0Var = ma0.a;
        dm5Var.a(lf1.class, ma0Var);
        dm5Var.a(vc0.class, ma0Var);
        ka0 ka0Var = ka0.a;
        dm5Var.a(rl.class, ka0Var);
        dm5Var.a(rc0.class, ka0Var);
        ra0 ra0Var = ra0.a;
        dm5Var.a(od6.class, ra0Var);
        dm5Var.a(le0.class, ra0Var);
        na0 na0Var = na0.a;
        dm5Var.a(np1.class, na0Var);
        dm5Var.a(wc0.class, na0Var);
        qa0 qa0Var = qa0.a;
        dm5Var.a(is3.class, qa0Var);
        dm5Var.a(fe0.class, qa0Var);
        pa0 pa0Var = pa0.a;
        dm5Var.a(hs3.class, pa0Var);
        dm5Var.a(ee0.class, pa0Var);
        ta0 ta0Var = ta0.a;
        dm5Var.a(q97.class, ta0Var);
        dm5Var.a(oe0.class, ta0Var);
        oa0 oa0Var = oa0.a;
        dm5Var.a(pq3.class, oa0Var);
        dm5Var.a(de0.class, oa0Var);
        dm5Var.d = true;
        this.a = new cm5(dm5Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(j01.c);
        this.e = uf1Var2;
        this.f = uf1Var;
        this.g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(ct1.a("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [q51] */
    @Override // defpackage.dxa
    public final tc0 a(sc0 sc0Var) {
        String str;
        b bVarA;
        String str2;
        Integer numValueOf;
        Iterator it;
        le0.a aVar;
        bi0.a aVar2 = bi0.a.u;
        HashMap map = new HashMap();
        ArrayList arrayList = sc0Var.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            mm3 mm3Var = (mm3) obj;
            String strK = mm3Var.k();
            if (map.containsKey(strK)) {
                ((List) map.get(strK)).add(mm3Var);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(mm3Var);
                map.put(strK, arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            mm3 mm3Var2 = (mm3) ((List) entry.getValue()).get(i);
            eg8 eg8Var = eg8.t;
            long time = this.f.getTime();
            long time2 = this.e.getTime();
            vc0 vc0Var = new vc0(new rc0(Integer.valueOf(mm3Var2.h("sdk-version")), mm3Var2.a("model"), mm3Var2.a("hardware"), mm3Var2.a("device"), mm3Var2.a("product"), mm3Var2.a("os-uild"), mm3Var2.a("manufacturer"), mm3Var2.a("fingerprint"), mm3Var2.a("locale"), mm3Var2.a("country"), mm3Var2.a("mcc_mnc"), mm3Var2.a("application_build")));
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                numValueOf = null;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = ((List) entry.getValue()).iterator();
            while (it3.hasNext()) {
                mm3 mm3Var3 = (mm3) it3.next();
                vf3 vf3VarD = mm3Var3.d();
                ag3 ag3Var = vf3VarD.a;
                byte[] bArr = vf3VarD.b;
                Iterator it4 = it2;
                if (ag3Var.equals(new ag3("proto"))) {
                    aVar = new le0.a();
                    aVar.e = bArr;
                } else {
                    if (ag3Var.equals(new ag3("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        le0.a aVar3 = new le0.a();
                        aVar3.f = str3;
                        aVar = aVar3;
                    } else {
                        it = it3;
                        String strC = be6.c("CctTransportBackend");
                        if (Log.isLoggable(strC, 5)) {
                            Log.w(strC, "Received event of unsupported encoding " + ag3Var + ". Skipping...");
                        }
                    }
                    it2 = it4;
                    it3 = it;
                }
                aVar.a = Long.valueOf(mm3Var3.e());
                aVar.d = Long.valueOf(mm3Var3.l());
                String str4 = mm3Var3.b().get("tz-offset");
                aVar.g = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar.h = new oe0(q97.b.t.get(mm3Var3.h("net-type")), q97.a.t.get(mm3Var3.h("mobile-subtype")));
                if (mm3Var3.c() != null) {
                    aVar.b = mm3Var3.c();
                }
                if (mm3Var3.i() != null) {
                    fe0 fe0Var = new fe0(new ee0(mm3Var3.i()));
                    np1.a aVar4 = np1.a.t;
                    aVar.c = new wc0(fe0Var);
                }
                if (mm3Var3.f() != null || mm3Var3.g() != null) {
                    aVar.i = new de0(mm3Var3.f() != null ? mm3Var3.f() : null, mm3Var3.g() != null ? mm3Var3.g() : null);
                }
                String strConcat = aVar.a == null ? " eventTimeMs" : BuildConfig.FLAVOR;
                if (aVar.d == null) {
                    strConcat = strConcat.concat(" eventUptimeMs");
                }
                if (aVar.g == null) {
                    strConcat = strConcat.concat(" timezoneOffsetSeconds");
                }
                if (!strConcat.isEmpty()) {
                    aa0.c("Missing required properties:".concat(strConcat));
                    return null;
                }
                it = it3;
                arrayList4.add(new le0(aVar.a.longValue(), aVar.b, aVar.c, aVar.d.longValue(), aVar.e, aVar.f, aVar.g.longValue(), aVar.h, aVar.i));
                it2 = it4;
                it3 = it;
            }
            arrayList3.add(new me0(time, time2, vc0Var, numValueOf, str2, arrayList4));
            i = 0;
        }
        int i3 = 5;
        uc0 uc0Var = new uc0(arrayList3);
        byte[] bArr2 = sc0Var.b;
        bi0.a aVar5 = bi0.a.v;
        URL urlC = this.d;
        if (bArr2 != null) {
            try {
                j01 j01VarA = j01.a(bArr2);
                str = j01VarA.b;
                if (str == null) {
                    str = null;
                }
                String str5 = j01VarA.a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new tc0(aVar5, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar6 = new a(urlC, uc0Var, str);
            ?? r3 = new Object() { // from class: q51
                public final r51.b a(r51.a aVar7) {
                    URL url = aVar7.a;
                    String strC2 = be6.c("CctTransportBackend");
                    if (Log.isLoggable(strC2, 4)) {
                        Log.i(strC2, String.format("Making request to: %s", url));
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    r51 r51Var = this.a;
                    httpURLConnection.setReadTimeout(r51Var.g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod(HttpConstants.Methods.POST);
                    httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
                    httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestProperty("Content-Type", HttpConstants.ContentTypes.JSON);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    String str6 = aVar7.c;
                    if (str6 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str6);
                    }
                    try {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                cm5 cm5Var = r51Var.a;
                                uc0 uc0Var2 = aVar7.b;
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                                dm5 dm5Var = cm5Var.a;
                                nn5 nn5Var = new nn5(bufferedWriter, dm5Var.a, dm5Var.b, dm5Var.c, dm5Var.d);
                                nn5Var.h(uc0Var2);
                                nn5Var.j();
                                nn5Var.b.flush();
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer numValueOf2 = Integer.valueOf(responseCode);
                                String strC3 = be6.c("CctTransportBackend");
                                if (Log.isLoggable(strC3, 4)) {
                                    Log.i(strC3, String.format("Status Code: %d", numValueOf2));
                                }
                                be6.a("CctTransportBackend", httpURLConnection.getHeaderField("Content-Type"), "Content-Type: %s");
                                be6.a("CctTransportBackend", httpURLConnection.getHeaderField("Content-Encoding"), "Content-Encoding: %s");
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    return new r51.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
                                if (responseCode != 200) {
                                    return new r51.b(responseCode, null, 0L);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        r51.b bVar = new r51.b(responseCode, null, ne0.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return bVar;
                                    } catch (Throwable th) {
                                        if (gZIPInputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            gZIPInputStream.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (inputStream == null) {
                                        throw th3;
                                    }
                                    try {
                                        inputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            if (outputStream == null) {
                                throw th7;
                            }
                            try {
                                outputStream.close();
                                throw th7;
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                                throw th7;
                            }
                        }
                    } catch (cg3 e) {
                        e = e;
                        be6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                        return new r51.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, null, 0L);
                    } catch (ConnectException e2) {
                        e = e2;
                        be6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new r51.b(500, null, 0L);
                    } catch (UnknownHostException e3) {
                        e = e3;
                        be6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new r51.b(500, null, 0L);
                    } catch (IOException e4) {
                        e = e4;
                        be6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                        return new r51.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, null, 0L);
                    }
                }
            };
            do {
                bVarA = r3.a(aVar6);
                URL url = bVarA.b;
                if (url != null) {
                    be6.a("CctTransportBackend", url, "Following redirect to: %s");
                    aVar6 = new a(url, aVar6.b, aVar6.c);
                } else {
                    aVar6 = null;
                }
                if (aVar6 == null) {
                    break;
                }
                i3--;
            } while (i3 >= 1);
            int i4 = bVarA.a;
            if (i4 == 200) {
                return new tc0(bi0.a.t, bVarA.c);
            }
            if (i4 < 500 && i4 != 404) {
                return i4 == 400 ? new tc0(bi0.a.w, -1L) : new tc0(aVar5, -1L);
            }
            return new tc0(aVar2, -1L);
        } catch (IOException e) {
            be6.b("CctTransportBackend", "Could not make request to the backend", e);
            return new tc0(aVar2, -1L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    @Override // defpackage.dxa
    public final be0 b(be0 be0Var) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        be0.a aVarM = be0Var.m();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = aVarM.f;
        if (map2 == null) {
            aa0.c("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        aVarM.a("model", Build.MODEL);
        aVarM.a("hardware", Build.HARDWARE);
        aVarM.a("device", Build.DEVICE);
        aVarM.a("product", Build.PRODUCT);
        aVarM.a("os-uild", Build.ID);
        aVarM.a("manufacturer", Build.MANUFACTURER);
        aVarM.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = aVarM.f;
        if (map3 == null) {
            aa0.c("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray<q97.b> sparseArray = q97.b.t;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = aVarM.f;
        if (map4 == null) {
            aa0.c("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray<q97.a> sparseArray2 = q97.a.t;
                subtype = 100;
            } else if (q97.a.t.get(subtype) == null) {
            }
            map = aVarM.f;
            if (map != null) {
                aa0.c("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            aVarM.a("country", Locale.getDefault().getCountry());
            aVarM.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            simOperator = ((TelephonyManager) context.getSystemService(AttributeType.PHONE)).getSimOperator();
            if (simOperator == null) {
                simOperator = BuildConfig.FLAVOR;
            }
            aVarM.a("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                be6.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            aVarM.a("application_build", Integer.toString(i2));
            return aVarM.b();
        }
        SparseArray<q97.a> sparseArray3 = q97.a.t;
        subtype = 0;
        map = aVarM.f;
        if (map != null) {
            aa0.c("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        aVarM.a("country", Locale.getDefault().getCountry());
        aVarM.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        simOperator = ((TelephonyManager) context2.getSystemService(AttributeType.PHONE)).getSimOperator();
        if (simOperator == null) {
            simOperator = BuildConfig.FLAVOR;
        }
        aVarM.a("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        aVarM.a("application_build", Integer.toString(i2));
        return aVarM.b();
    }
}
