import React from 'react';
import { TextInput, View, StyleSheet } from 'react-native';
import SubmitButton from './SubmitButton';

const styles = StyleSheet.create({
	Container: {
		flex: 1,
		flexDirection: 'column',
		alignItems: 'center',
		justifyContent: 'center',
		paddingTop: 200,
	},
});

export default function SubmitPage({ navigation: { navigate } }) {
	return (
		<View style={styles.Container}>
			<View style={{ flex: 0.2 }}>
				<TextInput
					style={{
						height: 50,
						width: 300,
						margin: 20,
						padding: 10,
						borderColor: 'gray',
						borderWidth: 1,
					}}
					placeholder='Enter UserId'
				/>
			</View>
			<View style={{ flex: 0.5 }}>
				<TextInput
					style={{
						height: 50,
						width: 300,
						margin: 20,
						padding: 10,
						borderColor: 'gray',
						borderWidth: 1,
					}}
					placeholder='Enter Password'
				/>
			</View>
			<View style={{ flex: 0.5 }}>
				<SubmitButton navigate={navigate} />
			</View>
		</View>
	);
}