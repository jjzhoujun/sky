package sky.core;

import android.os.Looper;
import android.widget.Toast;


/**
 * @author sky
 * @version 版本
 */
public class SKYToast {

	protected Toast mToast = null;

	/**
	 * 简单Toast 消息弹出
	 * 
	 * @param msg
	 *            参数
	 */
	public void show(final String msg) {
		// 判断是否在主线程
		boolean isMainLooper = Looper.getMainLooper().getThread() != Thread.currentThread();

		if (isMainLooper) {
			SKYHelper.mainLooper().execute(new Runnable() {

				@Override public void run() {
					showToast(msg, Toast.LENGTH_SHORT);
				}
			});
		} else {
			showToast(msg, Toast.LENGTH_SHORT);
		}
	}

	/**
	 * 简单Toast 消息弹出
	 * 
	 * @param msg
	 *            参数
	 */
	public void show(final int msg) {
		// 判断是否在主线程
		boolean isMainLooper = Looper.getMainLooper().getThread() != Thread.currentThread();

		if (isMainLooper) {
			SKYHelper.mainLooper().execute(new Runnable() {

				@Override public void run() {
					showToast(SKYHelper.getInstance().getString(msg), Toast.LENGTH_SHORT);
				}
			});
		} else {
			showToast(SKYHelper.getInstance().getString(msg), Toast.LENGTH_SHORT);
		}
	}

	/**
	 * 简单Toast 消息弹出
	 * 
	 * @param msg
	 *            参数
	 * @param duration
	 *            参数
	 */
	public void show(final String msg, final int duration) {
		// 判断是否在主线程
		boolean isMainLooper = Looper.getMainLooper().getThread() != Thread.currentThread();

		if (isMainLooper) {
			SKYHelper.mainLooper().execute(new Runnable() {

				@Override public void run() {
					showToast(msg, duration);
				}
			});
		} else {
			showToast(msg, duration);
		}
	}

	/**
	 * 简单Toast 消息弹出
	 * 
	 * @param msg
	 *            参数
	 * @param duration
	 *            参数
	 */
	public void show(final int msg, final int duration) {
		// 判断是否在主线程
		boolean isMainLooper = Looper.getMainLooper().getThread() != Thread.currentThread();

		if (isMainLooper) {
			SKYHelper.mainLooper().execute(new Runnable() {

				@Override public void run() {
					showToast(SKYHelper.getInstance().getString(msg), duration);
				}
			});
		} else {
			showToast(SKYHelper.getInstance().getString(msg), duration);
		}
	}

	/**
	 * 弹出提示
	 * 
	 * @param text
	 *            参数
	 * @param duration
	 *            参数
	 */
	protected void showToast(String text, int duration) {
		if (mToast == null) {
			mToast = Toast.makeText(SKYHelper.getInstance(), text, duration);
		} else {
			mToast.setText(text);
			mToast.setDuration(duration);
		}

		mToast.show();
	}

	public void clear() {
		if (mToast != null) {
			mToast.cancel();
			mToast = null;
		}
	}
}
