/**
 * 병합정렬
 * 반복적으로 쪼개어서 마지막에 합침
 */

var mergeSort = function(array) {

	// 원소가 하나일 때는 그대로 내보냄
	if (array.length < 2)
		return array;

	// 배열을 반으로 쪼갬
	var pivot = Math.floor(array.length / 2);
	var left = array.slice(0, pivot); // 쪼갠 왼쪽
	var right = array.slice(pivot, array.length); // 쪼갠 오른쪽

	return merge(mergeSort(left), mergeSort(right)); // 재귀적으로 쪼개고 합치기
}

function merge(left, right) {
	var result = [];

	// 두 배열의 길이의 값이 모두 empty가 아닐 때
	while (left.length && right.length) {

		if (left[0] <= right[0]) { 
			// 두 배열의 첫 원소를 비교해서
			
			result.push(left.shift()); 
			// 더 작은 수를 결과에 넣어줌
			// 제일 앞의 값을 빼서, result배열의 뒤에 넣어줌
			// => 계속 제일 앞의 값끼리 비교하기 위해

		} else {
			result.push(right.shift());
		}
	}
	
	// 어느 한 배열이 더 많이 남았다면[이미 들어간 수들 보다 더 큰 수들만 남게 되었으니] 나머지를 다 넣어줌
	// 이미 순차정렬 되어있는 배열 => 앞의 값부터 뽑아서 result배열에 뒤에 더해주면 됨
	while (left.length)
		result.push(left.shift());

	while (right.length)
		result.push(right.shift());

	return result;
};

mergeSort([ 5, 2, 4, 7, 6, 1, 3, 8 ]); // [1, 2, 3, 4, 5, 6, 7, 8]
