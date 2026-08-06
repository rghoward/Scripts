package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rra {
    public final Context a;
    public final tu6 b;
    public final nn4 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final pra h;
    public final n30 e = new n30();
    public boolean g = false;

    public rra(FirebaseMessaging firebaseMessaging, tu6 tu6Var, pra praVar, nn4 nn4Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = tu6Var;
        this.h = praVar;
        this.c = nn4Var;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static <T> void a(r9a<T> r9aVar) throws IOException {
        try {
            caa.b(r9aVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        nn4 nn4Var = this.c;
        nn4Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(nn4Var.a(nn4Var.c(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        nn4 nn4Var = this.c;
        nn4Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(nn4Var.a(nn4Var.c(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #1 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #1 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() throws IOException {
        ora oraVarA;
        while (true) {
            synchronized (this) {
                try {
                    oraVarA = this.h.a();
                    if (oraVarA == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = oraVarA.b;
                String str2 = oraVarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + oraVarA + ".");
                    }
                } else if (str.equals("S")) {
                    b(str2);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + oraVarA + ".");
                }
                pra praVar = this.h;
                synchronized (praVar) {
                    try {
                        final lm9 lm9Var = praVar.a;
                        String str3 = oraVarA.c;
                        synchronized (lm9Var.d) {
                            try {
                                if (lm9Var.d.remove(str3)) {
                                    lm9Var.e.execute(new Runnable() { // from class: km9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            lm9 lm9Var2 = lm9Var;
                                            synchronized (lm9Var2.d) {
                                                SharedPreferences.Editor editorEdit = lm9Var2.a.edit();
                                                String str4 = lm9Var2.b;
                                                StringBuilder sb = new StringBuilder();
                                                Iterator<String> it = lm9Var2.d.iterator();
                                                while (it.hasNext()) {
                                                    sb.append(it.next());
                                                    sb.append(lm9Var2.c);
                                                }
                                                editorEdit.putString(str4, sb.toString()).apply();
                                            }
                                        }
                                    });
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = oraVarA.c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                            t9a t9aVar = (t9a) arrayDeque.poll();
                            if (t9aVar != null) {
                                t9aVar.b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void f(long j) {
        this.f.schedule(new sra(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
