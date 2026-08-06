package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zp2 implements dq2.a {
    public final Context a;
    public Boolean b;

    public zp2(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    @Override // dq2.a
    public final k80 a(q70 q70Var, id4 id4Var) {
        boolean zBooleanValue;
        id4Var.getClass();
        int i = id4Var.H;
        q70Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return k80.d;
        }
        Boolean bool = this.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = j80.b(context).getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.b = Boolean.FALSE;
            }
            zBooleanValue = this.b.booleanValue();
        }
        String str = id4Var.o;
        str.getClass();
        int iC = fv6.c(str, id4Var.k);
        if (iC == 0 || i2 < n6b.q(iC)) {
            return k80.d;
        }
        int iR = n6b.r(id4Var.G);
        if (iR == 0) {
            return k80.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iR).setEncoding(iC).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, q70Var.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return k80.d;
                }
                z = (directPlaybackSupport & 3) == 3;
                k80.a aVar = new k80.a();
                aVar.a = true;
                aVar.b = z;
                aVar.c = zBooleanValue;
                return aVar.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, q70Var.a())) {
                    return k80.d;
                }
                k80.a aVar2 = new k80.a();
                aVar2.a = true;
                aVar2.c = zBooleanValue;
                return aVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, q70Var.a());
            if (playbackOffloadSupport == 0) {
                return k80.d;
            }
            k80.a aVar3 = new k80.a();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            aVar3.a = true;
            aVar3.b = z;
            aVar3.c = zBooleanValue;
            return aVar3.a();
        } catch (IllegalArgumentException unused) {
            return k80.d;
        }
    }
}
