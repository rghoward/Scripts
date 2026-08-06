package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.e;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e80 {
    public final l5a<AudioManager> a;
    public final Handler b;
    public e c;
    public q70 d;
    public int f;
    public f80 h;
    public float g = 1.0f;
    public int e = 0;

    public e80(final Context context, Looper looper, e eVar) {
        this.a = m5a.a(new l5a() { // from class: c80
            @Override // defpackage.l5a
            public final Object get() {
                return j80.b(context);
            }
        });
        this.c = eVar;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        j80.a(this.a.get(), this.h);
    }

    public final void b(int i) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.A.a(33, i, 0).b();
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        e eVar = this.c;
        if (eVar != null) {
            eVar.A.k(34);
        }
    }

    public final int d(int i, boolean z) {
        int i2;
        f80.a aVar;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                f80 f80Var = this.h;
                if (f80Var == null) {
                    if (f80Var == null) {
                        aVar = new f80.a();
                        aVar.b = q70.b;
                        aVar.a = i2;
                    } else {
                        f80.a aVar2 = new f80.a();
                        aVar2.a = f80Var.a;
                        aVar2.b = f80Var.d;
                        aVar2.c = f80Var.e;
                        aVar = aVar2;
                    }
                    q70 q70Var = this.d;
                    q70Var.getClass();
                    aVar.b = q70Var;
                    aVar.c = false;
                    aVar.d = true;
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: b80
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            e80 e80Var = this.a;
                            e80Var.getClass();
                            if (i4 == -3 || i4 == -2) {
                                if (i4 != -2) {
                                    e80Var.c(4);
                                    return;
                                } else {
                                    e80Var.b(0);
                                    e80Var.c(3);
                                    return;
                                }
                            }
                            if (i4 == -1) {
                                e80Var.b(-1);
                                e80Var.a();
                                e80Var.c(1);
                            } else if (i4 != 1) {
                                d80.a(i4, "Unknown focus change type: ", "AudioFocusManager");
                            } else {
                                e80Var.c(2);
                                e80Var.b(1);
                            }
                        }
                    };
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new f80(aVar.a, onAudioFocusChangeListener, handler, aVar.b, aVar.c, aVar.d);
                }
                int iC = j80.c(this.a.get(), this.h);
                if (iC == 1 || iC == 2) {
                    c(2);
                    return 1;
                }
                c(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
