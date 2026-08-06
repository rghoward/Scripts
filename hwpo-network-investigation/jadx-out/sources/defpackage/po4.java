package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class po4 {
    public static sv8 a;

    public static final ox6 a(ox6 ox6Var, oh4<? super ro4, g2b> oh4Var) {
        return ox6Var.H(new ar0(oh4Var));
    }

    public static ox6 b(ox6 ox6Var, float f, float f2, float f3, float f4, jl9 jl9Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = ava.b;
        jl9 jl9Var2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? al8.a : jl9Var;
        long j2 = so4.a;
        return ox6Var.H(new mo4(f5, f6, f7, f8, 0.0f, j, jl9Var2, false, j2, j2));
    }

    public static ox6 c(ox6 ox6Var, float f, float f2, float f3, float f4, jl9 jl9Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 256) != 0 ? 0.0f : f4;
        long j = ava.b;
        jl9 jl9Var2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? al8.a : jl9Var;
        boolean z = (i & 4096) == 0;
        long j2 = so4.a;
        return ox6Var.H(new mo4(f5, f6, f7, 0.0f, f8, j, jl9Var2, z, j2, j2));
    }
}
