package defpackage;

import android.os.Process;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dkc extends Thread {
    public final Object t;
    public final BlockingQueue u;
    public boolean v = false;
    public final /* synthetic */ fkc w;

    public dkc(fkc fkcVar, String str, BlockingQueue blockingQueue) {
        this.w = fkcVar;
        a78.g(blockingQueue);
        this.t = new Object();
        this.u = blockingQueue;
        setName(str);
    }

    public final void a() {
        fkc fkcVar = this.w;
        synchronized (fkcVar.i) {
            try {
                if (!this.v) {
                    fkcVar.j.release();
                    fkcVar.i.notifyAll();
                    if (this == fkcVar.c) {
                        fkcVar.c = null;
                    } else if (this == fkcVar.d) {
                        fkcVar.d = null;
                    } else {
                        thc thcVar = fkcVar.a.f;
                        tkc.m(thcVar);
                        thcVar.f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.w.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                thc thcVar = this.w.a.f;
                tkc.m(thcVar);
                thcVar.i.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.u;
                bkc bkcVar = (bkc) blockingQueue.poll();
                if (bkcVar != null) {
                    Process.setThreadPriority(true != bkcVar.u ? 10 : threadPriority);
                    bkcVar.run();
                } else {
                    Object obj = this.t;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.w.getClass();
                            try {
                                obj.wait(AudioConstants.TRANSCRIPTION_TIMEOUT_MS);
                            } catch (InterruptedException e2) {
                                thc thcVar2 = this.w.a.f;
                                tkc.m(thcVar2);
                                thcVar2.i.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.w.i) {
                        if (this.u.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
