package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ooa extends ey9 {
    public final long a;
    public final long b;

    public ooa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long d(long j, pt7 pt7Var) {
        long jZ = pt7Var.z();
        if ((128 & jZ) != 0) {
            return 8589934591L & ((((jZ & 1) << 32) | pt7Var.B()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ey9
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return jp2.a(this.b, " }", sb);
    }
}
