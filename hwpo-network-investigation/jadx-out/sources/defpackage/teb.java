package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class teb extends GLSurfaceView implements veb {
    public static final /* synthetic */ int u = 0;
    public final a t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements GLSurfaceView.Renderer {
        public static final float[] C = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] D = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer E = om4.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public int A;
        public ueb B;
        public final teb t;
        public final int[] u = new int[3];
        public final int[] v = new int[3];
        public final int[] w = new int[3];
        public final int[] x = new int[3];
        public final AtomicReference<ueb> y = new AtomicReference<>();
        public nm4 z;

        public a(teb tebVar) {
            this.t = tebVar;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.w;
                this.x[i] = -1;
                iArr[i] = -1;
            }
        }

        public final void a() {
            int[] iArr = this.u;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i = 0; i < 3; i++) {
                    nm4 nm4Var = this.z;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(nm4Var.a, D[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    om4.a(3553, iArr[i]);
                }
                om4.b();
            } catch (om4.a e) {
                md6.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            ueb andSet = this.y.getAndSet(null);
            if (andSet == null && this.B == null) {
                return;
            }
            if (andSet != null) {
                ueb uebVar = this.B;
                if (uebVar != null) {
                    uebVar.getClass();
                    throw null;
                }
                this.B = andSet;
            }
            this.B.getClass();
            GLES20.glUniformMatrix3fv(this.A, 1, false, C, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.v;
            try {
                nm4 nm4Var = new nm4("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.z = nm4Var;
                GLES20.glVertexAttribPointer(nm4Var.b("in_pos"), 2, 5126, false, 0, (Buffer) E);
                iArr[0] = this.z.b("in_tc_y");
                iArr[1] = this.z.b("in_tc_u");
                iArr[2] = this.z.b("in_tc_v");
                this.A = GLES20.glGetUniformLocation(this.z.a, "mColorConversion");
                om4.b();
                a();
                om4.b();
            } catch (om4.a e) {
                md6.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public teb(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.t = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(ueb uebVar) {
        a aVar = this.t;
        if (aVar.y.getAndSet(uebVar) != null) {
            throw null;
        }
        aVar.t.requestRender();
    }

    @Deprecated
    public veb getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
