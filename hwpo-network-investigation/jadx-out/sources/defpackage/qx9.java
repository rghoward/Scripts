package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qx9 extends GLSurfaceView {
    public static final /* synthetic */ int E = 0;
    public Surface A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final CopyOnWriteArrayList<b> t;
    public final SensorManager u;
    public final Sensor v;
    public final hl7 w;
    public final Handler x;
    public final e49 y;
    public SurfaceTexture z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements GLSurfaceView.Renderer, hl7.a {
        public float A;
        public final e49 t;
        public final float[] w;
        public final float[] x;
        public final float[] y;
        public float z;
        public final float[] u = new float[16];
        public final float[] v = new float[16];
        public final float[] B = new float[16];
        public final float[] C = new float[16];

        public a(e49 e49Var) {
            float[] fArr = new float[16];
            this.w = fArr;
            float[] fArr2 = new float[16];
            this.x = fArr2;
            float[] fArr3 = new float[16];
            this.y = fArr3;
            this.t = e49Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.A = 3.1415927f;
        }

        @Override // hl7.a
        public final synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.w;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.A = f2;
            Matrix.setRotateM(this.x, 0, -this.z, (float) Math.cos(f2), (float) Math.sin(this.A), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long lD;
            synchronized (this) {
                Matrix.multiplyMM(this.C, 0, this.w, 0, this.y, 0);
                Matrix.multiplyMM(this.B, 0, this.x, 0, this.C, 0);
            }
            Matrix.multiplyMM(this.v, 0, this.u, 0, this.B, 0);
            e49 e49Var = this.t;
            float[] fArr2 = this.v;
            GLES20.glClear(16384);
            try {
                om4.b();
            } catch (om4.a e) {
                md6.e("SceneRenderer", "Failed to draw a frame", e);
            }
            if (e49Var.t.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = e49Var.C;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    om4.b();
                } catch (om4.a e2) {
                    md6.e("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (e49Var.u.compareAndSet(true, false)) {
                    Matrix.setIdentityM(e49Var.z, 0);
                }
                long timestamp = e49Var.C.getTimestamp();
                soa<Long> soaVar = e49Var.x;
                synchronized (soaVar) {
                    lD = soaVar.d(timestamp, false);
                }
                Long l = lD;
                if (l != null) {
                    gh4 gh4Var = e49Var.w;
                    float[] fArr3 = e49Var.z;
                    float[] fArrF = gh4Var.c.f(l.longValue());
                    if (fArrF != null) {
                        float[] fArr4 = gh4Var.b;
                        float f = fArrF[0];
                        float f2 = -fArrF[1];
                        float f3 = -fArrF[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!gh4Var.d) {
                            gh4.a(gh4Var.a, gh4Var.b);
                            gh4Var.d = true;
                        }
                        Matrix.multiplyMM(fArr3, 0, gh4Var.a, 0, gh4Var.b, 0);
                    }
                }
                je8 je8VarF = e49Var.y.f(timestamp);
                if (je8VarF != null) {
                    le8 le8Var = e49Var.v;
                    le8Var.getClass();
                    if (le8.b(je8VarF)) {
                        le8Var.a = je8VarF.c;
                        le8Var.b = new le8.a(je8VarF.a.a[0]);
                        if (!je8VarF.d) {
                            je8.b bVar = je8VarF.b.a[0];
                            float[] fArr5 = bVar.c;
                            int length2 = fArr5.length;
                            om4.d(fArr5);
                            om4.d(bVar.d);
                        }
                    }
                }
            }
            Matrix.multiplyMM(e49Var.A, 0, fArr2, 0, e49Var.z, 0);
            le8 le8Var2 = e49Var.v;
            int i = e49Var.B;
            float[] fArr6 = e49Var.A;
            le8.a aVar = le8Var2.b;
            if (aVar == null) {
                return;
            }
            int i2 = le8Var2.a;
            if (i2 == 1) {
                fArr = le8.j;
            } else {
                fArr = i2 == 2 ? le8.k : le8.i;
            }
            GLES20.glUniformMatrix3fv(le8Var2.e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(le8Var2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(le8Var2.h, 0);
            try {
                om4.b();
            } catch (om4.a e3) {
                md6.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(le8Var2.f, 3, 5126, false, 12, (Buffer) aVar.b);
            try {
                om4.b();
            } catch (om4.a e4) {
                md6.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(le8Var2.g, 2, 5126, false, 8, (Buffer) aVar.c);
            try {
                om4.b();
            } catch (om4.a e5) {
                md6.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(aVar.d, 0, aVar.a);
            try {
                om4.b();
            } catch (om4.a e6) {
                md6.e("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.u, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            final qx9 qx9Var = qx9.this;
            final SurfaceTexture surfaceTextureA = this.t.a();
            qx9Var.x.post(new Runnable() { // from class: px9
                @Override // java.lang.Runnable
                public final void run() {
                    qx9 qx9Var2 = qx9Var;
                    SurfaceTexture surfaceTexture = qx9Var2.z;
                    Surface surface = qx9Var2.A;
                    SurfaceTexture surfaceTexture2 = surfaceTextureA;
                    Surface surface2 = new Surface(surfaceTexture2);
                    qx9Var2.z = surfaceTexture2;
                    qx9Var2.A = surface2;
                    Iterator<qx9.b> it = qx9Var2.t.iterator();
                    while (it.hasNext()) {
                        it.next().n(surface2);
                    }
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    if (surface != null) {
                        surface.release();
                    }
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void m();

        void n(Surface surface);
    }

    public qx9(Context context) {
        super(context, null);
        this.t = new CopyOnWriteArrayList<>();
        this.x = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.u = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.v = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        e49 e49Var = new e49();
        this.y = e49Var;
        a aVar = new a(e49Var);
        View.OnTouchListener vraVar = new vra(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.w = new hl7(windowManager.getDefaultDisplay(), vraVar, aVar);
        this.B = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(vraVar);
    }

    public final void a() {
        boolean z = this.B && this.C;
        Sensor sensor = this.v;
        if (sensor == null || z == this.D) {
            return;
        }
        hl7 hl7Var = this.w;
        SensorManager sensorManager = this.u;
        if (z) {
            sensorManager.registerListener(hl7Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(hl7Var);
        }
        this.D = z;
    }

    public o31 getCameraMotionListener() {
        return this.y;
    }

    public zeb getVideoFrameMetadataListener() {
        return this.y;
    }

    public Surface getVideoSurface() {
        return this.A;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x.post(new Runnable() { // from class: ox9
            @Override // java.lang.Runnable
            public final void run() {
                qx9 qx9Var = this.t;
                Surface surface = qx9Var.A;
                if (surface != null) {
                    Iterator<qx9.b> it = qx9Var.t.iterator();
                    while (it.hasNext()) {
                        it.next().m();
                    }
                }
                SurfaceTexture surfaceTexture = qx9Var.z;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                qx9Var.z = null;
                qx9Var.A = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.C = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.C = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.y.D = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.B = z;
        a();
    }
}
