package org.minazou67.sample.maven.single.service;

/**
 * サンプルのサービスです。
 *
 * @author minazou67
 */
public class SampleService {

	/**
	 * 指定された値を元に計算処理を実行し結果を返却します。
	 *
	 * @param value 処理対象の値
	 * @return 処理結果の値
	 */
	public Integer execute(Integer value) {
		// TODO 仕様未確定のため後で実装する
		if (value == null) {
			return value;
		}
		return value + 10;
	}
}