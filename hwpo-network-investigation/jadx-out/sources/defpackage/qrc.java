package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qrc implements Runnable {
    public final URL t;
    public final byte[] u;
    public final mrc v;
    public final String w;
    public final Map x;
    public final /* synthetic */ src y;

    public qrc(src srcVar, String str, URL url, byte[] bArr, HashMap map, mrc mrcVar) {
        Objects.requireNonNull(srcVar);
        this.y = srcVar;
        a78.d(str);
        this.t = url;
        this.u = bArr;
        this.v = mrcVar;
        this.w = str;
        this.x = map;
    }

    public final void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        fkc fkcVar = this.y.a.g;
        tkc.m(fkcVar);
        fkcVar.p(new Runnable() { // from class: orc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qrc qrcVar = this.t;
                qrcVar.v.a(qrcVar.w, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [qrc] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        ?? r6;
        IOException e;
        ?? r7;
        InputStream inputStream;
        String str = this.w;
        src srcVar = this.y;
        tkc tkcVar = srcVar.a;
        tkc tkcVar2 = srcVar.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.k();
        int i = 0;
        ?? r4 = 0;
        ?? r8 = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.t.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            tkcVar2.getClass();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.x;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] byteArray = this.u;
                    if (byteArray != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(byteArray);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            thc thcVar = tkcVar2.f;
                            tkc.m(thcVar);
                            phc phcVar = thcVar.n;
                            int length = byteArray.length;
                            phcVar.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(byteArray);
                                outputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                r4 = 0;
                                r7 = outputStream;
                                if (r7 != 0) {
                                    try {
                                        r7.close();
                                    } catch (IOException e3) {
                                        thc thcVar2 = tkcVar2.f;
                                        tkc.m(thcVar2);
                                        thcVar2.f.c(thc.o(str), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(i, e, null, r4);
                            } catch (Throwable th2) {
                                th = th2;
                                r8 = 0;
                                r6 = outputStream;
                                if (r6 != 0) {
                                    try {
                                        r6.close();
                                    } catch (IOException e4) {
                                        thc thcVar3 = tkcVar2.f;
                                        tkc.m(thcVar3);
                                        thcVar3.f.c(thc.o(str), e4, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                a(i, null, null, r8);
                                throw th;
                            }
                        } catch (IOException e5) {
                            thc thcVar4 = tkcVar2.f;
                            tkc.m(thcVar4);
                            thcVar4.f.b(e5, "Failed to gzip post request content");
                            throw e5;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr);
                                        if (i2 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            a(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i2);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = null;
                            }
                        } catch (IOException e6) {
                            r4 = byteArray;
                            e = e6;
                            i = responseCode;
                            r7 = 0;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i, e, null, r4);
                        } catch (Throwable th5) {
                            r8 = byteArray;
                            th = th5;
                            i = responseCode;
                            r6 = 0;
                            if (r6 != 0) {
                                r6.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            a(i, null, null, r8);
                            throw th;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        i = responseCode;
                        r7 = r4;
                        if (r7 != 0) {
                            r7.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i, e, null, r4);
                    } catch (Throwable th6) {
                        th = th6;
                        i = responseCode;
                        r6 = r4;
                        if (r6 != 0) {
                            r6.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        a(i, null, null, r8);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
            r7 = 0;
            r4 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r6 = 0;
            r8 = 0;
        }
    }
}
