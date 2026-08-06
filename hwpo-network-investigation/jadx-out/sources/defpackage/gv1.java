package defpackage;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 {
    public static final HashMap d = new HashMap();
    public static final ql6 e = new ql6();
    public final Executor a;
    public final sv1 b;
    public q6d c = null;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<TResult> implements di7<TResult>, lh7, ch7 {
        public final CountDownLatch t = new CountDownLatch(1);

        @Override // defpackage.ch7
        public final void b() {
            this.t.countDown();
        }

        @Override // defpackage.lh7
        public final void d(Exception exc) {
            this.t.countDown();
        }

        @Override // defpackage.di7
        public final void onSuccess(TResult tresult) {
            this.t.countDown();
        }
    }

    public gv1(Executor executor, sv1 sv1Var) {
        this.a = executor;
        this.b = sv1Var;
    }

    public static Object a(r9a r9aVar) throws ExecutionException, TimeoutException {
        a aVar = new a();
        Executor executor = e;
        r9aVar.f(executor, aVar);
        r9aVar.e(executor, aVar);
        r9aVar.a(executor, aVar);
        if (!aVar.t.await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (r9aVar.n()) {
            return r9aVar.j();
        }
        throw new ExecutionException(r9aVar.i());
    }

    public final synchronized r9a<b> b() {
        try {
            q6d q6dVar = this.c;
            if (q6dVar == null || (q6dVar.m() && !this.c.n())) {
                Executor executor = this.a;
                final sv1 sv1Var = this.b;
                this.c = caa.c(executor, new Callable() { // from class: dv1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        FileInputStream fileInputStreamOpenFileInput;
                        Throwable th;
                        sv1 sv1Var2 = sv1Var;
                        synchronized (sv1Var2) {
                            try {
                                try {
                                    fileInputStreamOpenFileInput = sv1Var2.a.openFileInput(sv1Var2.b);
                                    try {
                                        int iAvailable = fileInputStreamOpenFileInput.available();
                                        byte[] bArr = new byte[iAvailable];
                                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                        b bVarA = b.a(new JSONObject(new String(bArr, "UTF-8")));
                                        fileInputStreamOpenFileInput.close();
                                        return bVarA;
                                    } catch (FileNotFoundException | JSONException unused) {
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            } catch (FileNotFoundException | JSONException unused2) {
                                fileInputStreamOpenFileInput = null;
                            } catch (Throwable th4) {
                                fileInputStreamOpenFileInput = null;
                                th = th4;
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final b c() {
        synchronized (this) {
            try {
                q6d q6dVar = this.c;
                if (q6dVar != null && q6dVar.n()) {
                    return (b) this.c.j();
                }
                try {
                    return (b) a(b());
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
