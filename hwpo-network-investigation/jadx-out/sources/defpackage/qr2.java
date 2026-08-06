package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.ably.lib.http.HttpConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 extends ck0 {
    public final int e;
    public final int f;
    public final o45 g;
    public final o45 h;
    public of2 i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements if2.a {
        public final o45 a = new o45();
        public final int b = 8000;
        public final int c = 8000;

        @Override // if2.a
        public final if2 a() {
            return new qr2(this.b, this.c, this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends qd4<String, List<String>> {
        public final Map<String, List<String>> x;

        public b(Map<String, List<String>> map) {
            super(10);
            this.x = map;
        }

        @Override // defpackage.ln4
        public final Object E0() {
            return this.x;
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && this.x.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            ni6 ni6Var = new ni6(((oh1) entrySet()).iterator());
            if (obj == null) {
                while (ni6Var.hasNext()) {
                    if (ni6Var.next() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (ni6Var.hasNext()) {
                if (obj.equals(ni6Var.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.qd4, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return lk9.b(super.entrySet(), new rr2());
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && oi6.a(obj, this);
        }

        @Override // java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return this.x.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return lk9.c(entrySet());
        }

        @Override // defpackage.qd4, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && this.x.containsKey(null));
        }

        @Override // defpackage.qd4, java.util.Map
        public final Set<String> keySet() {
            return lk9.b(super.keySet(), new sr2());
        }

        @Override // defpackage.qd4, java.util.Map
        public final int size() {
            return super.size() - (this.x.containsKey(null) ? 1 : 0);
        }
    }

    public qr2(int i, int i2, o45 o45Var) {
        super(true);
        this.e = i;
        this.f = i2;
        this.g = o45Var;
        this.h = new o45();
    }

    @Override // defpackage.if2
    public final long c(of2 of2Var) throws l45 {
        boolean z;
        long j;
        long jMax;
        String str;
        this.i = of2Var;
        this.o = 0L;
        this.n = 0L;
        q(of2Var);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            HttpURLConnection httpURLConnectionT = t(new URL(of2Var.a.toString()), of2Var.b, of2Var.c, of2Var.e, of2Var.f, (of2Var.g & 1) == 1, true, of2Var.d);
            long j2 = of2Var.f;
            long j3 = of2Var.e;
            this.j = httpURLConnectionT;
            this.m = httpURLConnectionT.getResponseCode();
            httpURLConnectionT.getResponseMessage();
            int i = this.m;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionT.getHeaderFields();
                if (this.m == 416) {
                    String headerField = httpURLConnectionT.getHeaderField("Content-Range");
                    Pattern pattern = i55.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = i55.b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j3 == j) {
                        this.l = z;
                        r(of2Var);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionT.getErrorStream();
                try {
                    if (errorStream != null) {
                        a01.b(errorStream);
                    } else {
                        String str2 = n6b.a;
                    }
                } catch (IOException unused) {
                    String str3 = n6b.a;
                }
                s();
                throw new n45(this.m, this.m == 416 ? new lf2(2008) : null, headerFields);
            }
            httpURLConnectionT.getContentType();
            if (this.m != 200 || j3 == 0) {
                j3 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionT.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.n = j2;
            } else {
                String headerField2 = httpURLConnectionT.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionT.getHeaderField("Content-Range");
                Pattern pattern2 = i55.a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        md6.d("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = i55.a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            str = "]";
                            long j5 = (j4 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                try {
                                    md6.g("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                    jMax = Math.max(jMax, j5);
                                } catch (NumberFormatException unused3) {
                                    md6.d("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.n = jMax != -1 ? jMax - j3 : -1L;
            }
            try {
                this.k = httpURLConnectionT.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.k = new GZIPInputStream(this.k);
                }
                this.l = true;
                r(of2Var);
                try {
                    u(j3);
                    return this.n;
                } catch (IOException e) {
                    s();
                    if (e instanceof l45) {
                        throw ((l45) e);
                    }
                    throw new l45(e, 2000, 1);
                }
            } catch (IOException e2) {
                s();
                throw new l45(e2, 2000, 1);
            }
        } catch (IOException e3) {
            s();
            throw l45.a(e3, 1);
        }
    }

    @Override // defpackage.if2
    public final void close() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = n6b.a;
                    throw new l45(e, 2000, 3);
                }
            }
            this.k = null;
            s();
            if (this.l) {
                this.l = false;
                p();
            }
            this.j = null;
            this.i = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.k = null;
            s();
            if (this.l) {
                this.l = false;
                p();
            }
            this.j = null;
            this.i = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.if2
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        of2 of2Var = this.i;
        if (of2Var != null) {
            return of2Var.a;
        }
        return null;
    }

    @Override // defpackage.if2
    public final Map<String, List<String>> k() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? vl8.z : new b(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) throws l45 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.n;
            if (j != -1) {
                long j2 = j - this.o;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.k;
                    String str = n6b.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.o += (long) i3;
                        o(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.k;
                String str2 = n6b.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.o += (long) i3;
                    o(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = n6b.a;
            throw l45.a(e, 2);
        }
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                md6.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection t(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        o45 o45Var = this.g;
        if (o45Var != null) {
            map2.putAll(o45Var.a());
        }
        map2.putAll(this.h.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = i55.a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbB = ao3.b("bytes=", j, "-");
            if (j2 != -1) {
                sbB.append((j + j2) - 1);
            }
            string = sbB.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = of2.h;
        if (i == 1) {
            str = HttpConstants.Methods.GET;
        } else if (i == 2) {
            str = HttpConstants.Methods.POST;
        } else {
            if (i != 3) {
                d43.c();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void u(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.k;
            String str = n6b.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new l45(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new l45();
            }
            j -= (long) i;
            o(i);
        }
    }
}
