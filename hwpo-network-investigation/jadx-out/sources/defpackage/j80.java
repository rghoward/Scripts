package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j80 {
    public static AudioManager a;

    public static void a(AudioManager audioManager, f80 f80Var) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(f80Var.b);
            return;
        }
        Object obj = f80Var.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static synchronized AudioManager b(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final bv1 bv1Var = new bv1();
                fi0.a().execute(new Runnable() { // from class: i80
                    @Override // java.lang.Runnable
                    public final void run() {
                        j80.a = (AudioManager) applicationContext.getSystemService("audio");
                        bv1Var.c();
                    }
                });
                bv1Var.a();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public static int c(AudioManager audioManager, f80 f80Var) {
        int volumeControlStream;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Object obj = f80Var.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = f80Var.b;
        q70 q70Var = f80Var.d;
        q70Var.getClass();
        if (i >= 26) {
            try {
                volumeControlStream = q70Var.a().getVolumeControlStream();
                if (volumeControlStream == Integer.MIN_VALUE) {
                    volumeControlStream = 3;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            volumeControlStream = 3;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, volumeControlStream, f80Var.a);
    }
}
