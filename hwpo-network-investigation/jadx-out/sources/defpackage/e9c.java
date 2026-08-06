package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e9c extends bgc {
    public final /* synthetic */ ik0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9c(ik0 ik0Var, Looper looper) {
        super(looper);
        this.a = ik0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        uac uacVar;
        ik0 ik0Var = this.a;
        int i = ik0Var.Q.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (uacVar = (uac) message.obj) != null) {
                synchronized (uacVar) {
                    uacVar.a = null;
                }
                ik0 ik0Var2 = uacVar.c;
                synchronized (ik0Var2.E) {
                    ik0Var2.E.remove(uacVar);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !ik0Var.d()) {
            uac uacVar2 = (uac) message.obj;
            if (uacVar2 != null) {
                synchronized (uacVar2) {
                    uacVar2.a = null;
                }
                ik0 ik0Var3 = uacVar2.c;
                synchronized (ik0Var3.E) {
                    ik0Var3.E.remove(uacVar2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            ik0Var.N = new ax1(message.arg2, null, null);
            if (!ik0Var.O && !TextUtils.isEmpty(ik0Var.y()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(ik0Var.y());
                    if (!ik0Var.O) {
                        ik0Var.C(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ax1 ax1Var = ik0Var.N;
            if (ax1Var == null) {
                ax1Var = new ax1(8, null, null);
            }
            ik0Var.C.a(ax1Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ax1 ax1Var2 = ik0Var.N;
            if (ax1Var2 == null) {
                ax1Var2 = new ax1(8, null, null);
            }
            ik0Var.C.a(ax1Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            ik0Var.C.a(new ax1(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            ik0Var.C(5, null);
            ik0.a aVar = ik0Var.H;
            if (aVar != null) {
                aVar.g(message.arg2);
            }
            System.currentTimeMillis();
            ik0Var.B(5, 1, null);
            return;
        }
        if (i4 == 2 && !ik0Var.i()) {
            uac uacVar3 = (uac) message.obj;
            if (uacVar3 != null) {
                synchronized (uacVar3) {
                    uacVar3.a = null;
                }
                ik0 ik0Var4 = uacVar3.c;
                synchronized (ik0Var4.E) {
                    ik0Var4.E.remove(uacVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", d43.a(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        uac uacVar4 = (uac) message.obj;
        synchronized (uacVar4) {
            try {
                bool = uacVar4.a;
                if (uacVar4.b) {
                    String string = uacVar4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            uacVar4.a(bool);
        }
        synchronized (uacVar4) {
            uacVar4.b = true;
        }
        synchronized (uacVar4) {
            uacVar4.a = null;
        }
        ik0 ik0Var5 = uacVar4.c;
        synchronized (ik0Var5.E) {
            ik0Var5.E.remove(uacVar4);
        }
    }
}
