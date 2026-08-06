package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g55 implements xe2<InputStream> {
    public final wm4 t;
    public final int u;
    public HttpURLConnection v;
    public InputStream w;
    public volatile boolean x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
    }

    public g55(wm4 wm4Var, int i) {
        this.t = wm4Var;
        this.u = i;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // defpackage.xe2
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.xe2
    public final void b() {
        InputStream inputStream = this.w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.v;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.v = null;
    }

    @Override // defpackage.xe2
    public final void c(p98 p98Var, xe2.a<? super InputStream> aVar) {
        wm4 wm4Var = this.t;
        int i = vd6.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.e(e(wm4Var.d(), 0, null, wm4Var.b.a()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.d(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + vd6.a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // defpackage.xe2
    public final void cancel() {
        this.x = true;
    }

    public final InputStream e(URL url, int i, URL url2, Map<String, String> map) throws p45 {
        if (i >= 5) {
            throw new p45(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new p45(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.u;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.v = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.w = this.v.getInputStream();
                if (this.x) {
                    return null;
                }
                int iD = d(this.v);
                int i3 = iD / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.v;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.w = new iz1(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.w = httpURLConnection2.getInputStream();
                        }
                        return this.w;
                    } catch (IOException e) {
                        throw new p45(d(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (iD == -1) {
                        throw new p45(iD, null, "Http request failed");
                    }
                    try {
                        throw new p45(iD, null, this.v.getResponseMessage());
                    } catch (IOException e2) {
                        throw new p45(iD, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.v.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new p45(iD, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new p45(iD, e3, ct1.a("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new p45(d(this.v), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new p45(0, e5, "URL.openConnection threw");
        }
    }

    @Override // defpackage.xe2
    public final kf2 getDataSource() {
        return kf2.u;
    }
}
