package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wz7 extends Surface {
    public static int w;
    public static boolean x;
    public final boolean t;
    public final a u;
    public boolean v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends HandlerThread implements Handler.Callback {
        public y93 t;
        public Handler u;
        public Error v;
        public RuntimeException w;
        public wz7 x;

        public final void a(int i) throws om4.a {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.t.getClass();
            y93 y93Var = this.t;
            int[] iArr = y93Var.u;
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            om4.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr2 = new int[2];
            om4.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
            y93Var.v = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, y93.z, 0, eGLConfigArr, 0, 1, iArr3, 0);
            boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
            String str = n6b.a;
            om4.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(y93Var.v, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            om4.c("eglCreateContext failed", eGLContextEglCreateContext != null);
            y93Var.w = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = y93Var.v;
            if (i == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                om4.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            om4.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            y93Var.x = eGLSurfaceEglCreatePbufferSurface;
            GLES20.glGenTextures(1, iArr, 0);
            om4.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            y93Var.y = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(y93Var);
            SurfaceTexture surfaceTexture2 = this.t.y;
            surfaceTexture2.getClass();
            this.x = new wz7(this, surfaceTexture2, i != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.t.getClass();
            y93 y93Var = this.t;
            y93Var.t.removeCallbacks(y93Var);
            try {
                SurfaceTexture surfaceTexture = y93Var.y;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, y93Var.u, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = y93Var.v;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = y93Var.v;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = y93Var.x;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(y93Var.v, y93Var.x);
                }
                EGLContext eGLContext = y93Var.w;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(y93Var.v, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = y93Var.v;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(y93Var.v);
                }
                y93Var.v = null;
                y93Var.w = null;
                y93Var.x = null;
                y93Var.y = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (Error e) {
                        md6.e("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.v = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        md6.e("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.w = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (om4.a e3) {
                        md6.e("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.w = new IllegalStateException(e3);
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i == 2) {
                    try {
                        b();
                        quit();
                        return true;
                    } catch (Throwable th) {
                        try {
                            md6.e("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public wz7(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.u = aVar;
        this.t = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (((i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? om4.e("EGL_EXT_protected_content") : false) {
                return om4.e("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (om4.a e) {
            md6.d("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!x) {
                w = a(context);
                x = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return w != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.u) {
            try {
                if (!this.v) {
                    a aVar = this.u;
                    aVar.u.getClass();
                    aVar.u.sendEmptyMessage(2);
                    this.v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
