package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hl5 implements vob {
    public final Context a;
    public final an3 b;
    public final r49 c;

    public hl5(Context context, an3 an3Var, r49 r49Var) {
        this.a = context;
        this.b = an3Var;
        this.c = r49Var;
    }

    @Override // defpackage.vob
    public final void a(exa exaVar, int i) {
        b(exaVar, i, false);
    }

    @Override // defpackage.vob
    public final void b(exa exaVar, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(exaVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(r98.a(exaVar.c())).array());
        if (exaVar.b() != null) {
            adler32.update(exaVar.b());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    be6.a("JobInfoScheduler", exaVar, "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        long jC = this.b.C(exaVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        o98 o98VarC = exaVar.c();
        r49 r49Var = this.c;
        builder.setMinimumLatency(r49Var.b(o98VarC, jC, i));
        Set<r49.b> setB = r49Var.c().get(o98VarC).b();
        if (setB.contains(r49.b.t)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(r49.b.v)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(r49.b.u)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", exaVar.a());
        persistableBundle.putInt("priority", r98.a(exaVar.c()));
        if (exaVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(exaVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {exaVar, Integer.valueOf(value), Long.valueOf(r49Var.b(exaVar.c(), jC, i)), Long.valueOf(jC), Integer.valueOf(i)};
        String strC = be6.c("JobInfoScheduler");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
