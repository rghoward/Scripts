package defpackage;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.a;
import androidx.emoji2.text.d;
import androidx.emoji2.text.e;
import androidx.emoji2.text.g;
import j$.time.LocalDate;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ge3 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ ge3(Object obj, Object obj2, Object obj3, int i) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sh9.a aVar;
        sh9.a aVar2;
        int i;
        qi9 cVar;
        qi9 cVar2;
        switch (this.t) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.u;
                d.i iVar = (d.i) this.v;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.w;
                try {
                    g gVarA = a.a(bVar.a);
                    if (gVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g.b bVar2 = (g.b) gVarA.a;
                    synchronized (bVar2.d) {
                        bVar2.f = threadPoolExecutor;
                        break;
                    }
                    gVarA.a.a(new e(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                cj9 cj9Var = (cj9) this.u;
                tf0 tf0Var = (tf0) this.v;
                xi9 xi9Var = (xi9) this.w;
                cj9.a aVar3 = cj9.Companion;
                ij9 ij9VarQ = cj9Var.q();
                q09 q09Var = ij9VarQ.z;
                xi9Var.getClass();
                tf0 tf0Var2 = tf0.u;
                int i2 = 2;
                if (tf0Var != tf0Var2 && ij9VarQ.b().b) {
                    int iOrdinal = tf0Var.ordinal();
                    if (iOrdinal != 0) {
                        i2 = (iOrdinal == 2 || iOrdinal == 3) ? 0 : 1;
                    }
                    ij9VarQ.e(new zi9.b(new js7(ij9VarQ.b().a.t, Integer.valueOf(i2))));
                    return;
                }
                sh9 sh9Var = ij9VarQ.b().a.t;
                LocalDate localDateA = xi9Var.a();
                sh9Var.getClass();
                sh9.a aVar4 = sh9Var.c;
                sh9.a aVar5 = sh9Var.b;
                localDateA.getClass();
                sh9.a aVar6 = sh9Var.a;
                if (localDateA.equals(aVar6 != null ? aVar6.a.a() : null)) {
                    aVar4 = aVar6;
                } else if (localDateA.equals(aVar5.a.a())) {
                    aVar4 = aVar5;
                } else {
                    if (!localDateA.equals(aVar4 != null ? aVar4.a.a() : null)) {
                        aVar4 = null;
                    }
                }
                if (aVar4 == null) {
                    return;
                }
                boolean z = tf0Var == tf0Var2 || tf0Var == tf0.v;
                boolean z2 = tf0Var == tf0Var2 || tf0Var == tf0.t;
                q09Var.getClass();
                Integer num = (Integer) q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PLAN_ID");
                if (num != null) {
                    int iIntValue = num.intValue();
                    Object objA = q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_TITLE");
                    if (objA == null) {
                        z90.a("Required value was null.");
                        return;
                    }
                    String str = (String) objA;
                    boolean z3 = aVar4.d;
                    qi9 qi9Var = aVar4.c;
                    xi9 xi9Var2 = aVar4.a;
                    if (z2) {
                        LocalDate localDateMinusDays = xi9Var2.a().minusDays(1L);
                        localDateMinusDays.getClass();
                        xi9.a aVar7 = new xi9.a(iIntValue, localDateMinusDays);
                        if (qi9Var instanceof qi9.b) {
                            LocalDate localDateMinusDays2 = ((qi9.b) qi9Var).u.minusDays(1L);
                            localDateMinusDays2.getClass();
                            cVar2 = new qi9.b(localDateMinusDays2);
                        } else {
                            if (!(qi9Var instanceof qi9.c)) {
                                u.b();
                                return;
                            }
                            cVar2 = new qi9.c(((qi9.c) qi9Var).u - 1);
                        }
                        aVar = new sh9.a(aVar7, str, cVar2, z3);
                    } else {
                        aVar = null;
                    }
                    if (z) {
                        LocalDate localDatePlusDays = xi9Var2.a().plusDays(1L);
                        localDatePlusDays.getClass();
                        xi9.a aVar8 = new xi9.a(iIntValue, localDatePlusDays);
                        if (qi9Var instanceof qi9.b) {
                            LocalDate localDatePlusDays2 = ((qi9.b) qi9Var).u.plusDays(1L);
                            localDatePlusDays2.getClass();
                            cVar = new qi9.b(localDatePlusDays2);
                        } else {
                            if (!(qi9Var instanceof qi9.c)) {
                                u.b();
                                return;
                            }
                            cVar = new qi9.c(((qi9.c) qi9Var).u + 1);
                        }
                        aVar2 = new sh9.a(aVar8, str, cVar, z3);
                    } else {
                        aVar2 = null;
                    }
                    sh9 sh9Var2 = new sh9(aVar, aVar4, aVar2);
                    int iOrdinal2 = tf0Var.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        i = 1;
                    } else {
                        if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                            u.b();
                            return;
                        }
                        i = 0;
                    }
                    ij9VarQ.e(new zi9.a(tf0Var));
                    ij9VarQ.e(new zi9.b(new js7(sh9Var2, Integer.valueOf(i))));
                    return;
                }
                return;
        }
    }
}
