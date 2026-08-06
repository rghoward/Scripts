package defpackage;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p82 {
    public static final dp g = dp.d();
    public static final long h = 1000000;
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue<q82> a = new ConcurrentLinkedQueue<>();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, final zoa zoaVar) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new Runnable() { // from class: n82
                @Override // java.lang.Runnable
                public final void run() {
                    zoa zoaVar2 = zoaVar;
                    p82 p82Var = this.t;
                    q82 q82VarB = p82Var.b(zoaVar2);
                    if (q82VarB != null) {
                        p82Var.a.add(q82VarB);
                    }
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final q82 b(zoa zoaVar) {
        long j = this.d;
        dp dpVar = g;
        if (zoaVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long jA = zoaVar.a() + zoaVar.t;
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                q82.a aVarB = q82.B();
                aVarB.n();
                q82.y((q82) aVarB.u, jA);
                double d = (j4 + j5) / j;
                long j6 = h;
                long jRound = Math.round(d * j6);
                aVarB.n();
                q82.A((q82) aVarB.u, jRound);
                long jRound2 = Math.round(((j2 + j3) / j) * j6);
                aVarB.n();
                q82.z((q82) aVarB.u, jRound2);
                q82 q82VarL = aVarB.l();
                bufferedReader.close();
                return q82VarL;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            dpVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            dpVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            dpVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            dpVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
