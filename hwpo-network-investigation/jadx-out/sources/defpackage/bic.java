package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bic implements Runnable {
    public final URL t;
    public final byte[] u;
    public final xhc v;
    public final String w;
    public final Map x;
    public final /* synthetic */ dic y;

    public bic(dic dicVar, String str, URL url, byte[] bArr, Map map, xhc xhcVar) {
        Objects.requireNonNull(dicVar);
        this.y = dicVar;
        a78.d(str);
        a78.g(url);
        this.t = url;
        this.u = bArr;
        this.v = xhcVar;
        this.w = str;
        this.x = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00fe: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:255), block:B:51:0x00fc */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0101: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:258), block:B:52:0x0100 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        String str = this.w;
        dic dicVar = this.y;
        tkc tkcVar = dicVar.a;
        tkc tkcVar2 = dicVar.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.k();
        int i = 0;
        OutputStream outputStream = null;
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
                Map map5 = this.x;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.u;
                if (bArr != null) {
                    qzc qzcVar = dicVar.b.g;
                    lzc.U(qzcVar);
                    byte[] bArrQ = qzcVar.Q(bArr);
                    thc thcVar = tkcVar2.f;
                    tkc.m(thcVar);
                    phc phcVar = thcVar.n;
                    int length = bArrQ.length;
                    phcVar.b(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrQ);
                        outputStream2.close();
                    } catch (IOException e) {
                        iOException = e;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e2) {
                                thc thcVar2 = tkcVar2.f;
                                tkc.m(thcVar2);
                                thcVar2.f.c(thc.o(str), e2, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        fkc fkcVar2 = tkcVar2.g;
                        tkc.m(fkcVar2);
                        fkcVar2.p(new zhc(this.w, this.v, responseCode, iOException, null, map2));
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                thc thcVar3 = tkcVar2.f;
                                tkc.m(thcVar3);
                                thcVar3.f.c(thc.o(str), e3, "Error closing HTTP compressed POST connection output stream. appId");
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        fkc fkcVar3 = tkcVar2.g;
                        tkc.m(fkcVar3);
                        fkcVar3.p(new zhc(this.w, this.v, i, null, null, map));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i2 = inputStream.read(bArr2);
                                    if (i2 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        fkc fkcVar4 = tkcVar2.g;
                                        tkc.m(fkcVar4);
                                        fkcVar4.p(new zhc(this.w, this.v, responseCode, null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i2);
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
                    } catch (IOException e4) {
                        e = e4;
                        map2 = null;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        fkc fkcVar5 = tkcVar2.g;
                        tkc.m(fkcVar5);
                        fkcVar5.p(new zhc(this.w, this.v, responseCode, iOException, null, map2));
                    } catch (Throwable th5) {
                        th = th5;
                        map = null;
                        i = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        fkc fkcVar6 = tkcVar2.g;
                        tkc.m(fkcVar6);
                        fkcVar6.p(new zhc(this.w, this.v, i, null, null, map));
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    fkc fkcVar7 = tkcVar2.g;
                    tkc.m(fkcVar7);
                    fkcVar7.p(new zhc(this.w, this.v, responseCode, iOException, null, map2));
                } catch (Throwable th6) {
                    th = th6;
                    i = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    fkc fkcVar8 = tkcVar2.g;
                    tkc.m(fkcVar8);
                    fkcVar8.p(new zhc(this.w, this.v, i, null, null, map));
                    throw th;
                }
            } catch (IOException e6) {
                iOException = e6;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                map = null;
            }
        } catch (IOException e7) {
            iOException = e7;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
